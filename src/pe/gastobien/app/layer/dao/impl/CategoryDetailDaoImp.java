package pe.gastobien.app.layer.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.gastobien.app.domain.CategoryDetail;
import pe.gastobien.app.layer.dao.interfaces.CategoryDetailDao;

@Repository
public class CategoryDetailDaoImp implements CategoryDetailDao {

	@Override
	public void save(CategoryDetail t) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_InsertCategoryDetail](?,?,?,?,?,?,?,?)}");
			invocacion.setInt(1, t.getCategoryID());
			invocacion.setString(2, t.getCategoryNameDetail());
			invocacion.setString(3, t.getCategoryDescriptionDetail());
			invocacion.setDouble(4, t.getBudgetDetail());
			invocacion.setDouble(5, t.getSpendDetail());
			invocacion.setInt(6, t.getYearDetail());
			invocacion.setInt(7, t.getMonthDetail());
			invocacion.setBoolean(8, t.getActive());
			invocacion.executeUpdate();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	@Override
	public void update(CategoryDetail t) {

	}

	@Override
	public void delete(CategoryDetail t) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_DeleteCategoryDetail](?)}");
			invocacion.setInt(1, t.getDetalleCategoriaId());
			invocacion.executeUpdate();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	@Override
	public CategoryDetail getById(CategoryDetail t) {
		return null;
	}

	@Override
	public List<CategoryDetail> getAll(CategoryDetail t) {
		return null;
	}

	@Override
	public List<CategoryDetail> getCategoryDetailByCategoryId(int categoryId) {

		Connection cn = null;
		List<CategoryDetail> details = new ArrayList<CategoryDetail>();

		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_GetAllCategoryDetailByCategoryId](?)}");
			invocacion.setInt(1, categoryId);
			ResultSet respuesta = invocacion.executeQuery();
			while (respuesta.next()) {
				details.add(rowToBean(respuesta));
			}

			respuesta.close();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {

			}
		}
		return details;
	}

	private CategoryDetail rowToBean(ResultSet rs) throws SQLException {
		CategoryDetail a = new CategoryDetail();
		a.setCategoryID(rs.getInt(("CategoryID")));
		a.setDetalleCategoriaId(rs.getInt(("DetalleCategoriaId")));
		a.setCategoryNameDetail(rs.getString(("CategoryNameDetail")));
		a.setCategoryDescriptionDetail(rs
				.getString(("CategoryDescriptionDetail")));
		a.setBudgetDetail(rs.getDouble(("BudgetDetail")));
		a.setSpendDetail(rs.getDouble(("SpendDetail")));
		a.setYearDetail(rs.getInt(("YearDetail")));
		a.setMonthDetail(rs.getInt(("MonthDetail")));
		a.setActive(rs.getBoolean(("Active")));
		a.setAmountToShow(rs.getDouble(("AmountToShow")));
		return a;
	}

}
