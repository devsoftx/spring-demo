package pe.gastobien.app.layer.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.gastobien.app.domain.Category;
import pe.gastobien.app.layer.dao.interfaces.CategoryDao;

@Repository
public class CategoryDaoImp implements CategoryDao {

	@Override
	public void save(Category t) {
		// TODO Auto-generated method stub
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_InsertCategory](?,?,?,?,?,?,?)}");
			invocacion.setInt(1, t.getUserID());
			invocacion.setString(2, t.getCategoryName());
			invocacion.setString(3, t.getCategoryDescription());
			invocacion.setInt(4, t.getYearBudget());
			invocacion.setInt(5, t.getMonthBudget());
			invocacion.setBoolean(6, t.getActive());
			invocacion.setInt(7, t.getCategoryType());
			invocacion.executeUpdate();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void update(Category t) {
		// TODO Auto-generated method stub
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_UpdateCategory](?,?,?)}");
			invocacion.setInt(1, t.getCategoryID());
			invocacion.setString(2, t.getCategoryName());
			invocacion.setString(3, t.getCategoryDescription());
			invocacion.executeUpdate();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void delete(Category t) {
		// TODO Auto-generated method stub
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_DeleteCategory](?)}");
			invocacion.setInt(1, t.getCategoryID());
			invocacion.executeUpdate();
			invocacion.close();
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public Category getById(Category t) {
		Connection cn = null;
		Category category = new Category();

		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_GetCategoryById](?)}");
			invocacion.setInt(1, t.getCategoryID());
			ResultSet respuesta = invocacion.executeQuery();
			int index = 0;
			while (respuesta.next()) {
				category = rowToBean(respuesta, index);
				index++;
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
		return category;
	}

	@Override
	public List<Category> getAll(Category t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> getCategories(int userID, int year, int month) {
		Connection cn = null;
		List<Category> categories = new ArrayList<Category>();

		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_GetAllCategoriesByUserId](?,?,?)}");
			invocacion.setInt(1, userID);
			invocacion.setInt(2, year);
			invocacion.setInt(3, month);
			ResultSet respuesta = invocacion.executeQuery();
			int index = 0;
			while (respuesta.next()) {
				categories.add(rowToBean(respuesta, index));
				index++;
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
		return categories;
	}

	private Category rowToBean(ResultSet rs, int index) throws SQLException {
		Category a = new Category();
		a.setUserID(rs.getInt(("UserID")));
		a.setCategoryID(rs.getInt(("CategoryID")));
		a.setCategoryName(rs.getString(("CategoryName")));
		a.setCategoryDescription(rs.getString(("CategoryDescription")));
		a.setCategoryBudget(rs.getDouble(("CategoryBudget")));
		a.setSpendCategory(rs.getDouble(("SpendCategory")));
		a.setYearBudget(rs.getInt(("YearBudget")));
		a.setMonthBudget(rs.getInt(("MonthBudget")));
		a.setCreationDate(rs.getDate(("CreationDate")));
		a.setActive(rs.getBoolean(("Active")));
		a.setParentCategoryId(rs.getInt(("ParentCategoryId")));
		a.setCategoryType(rs.getInt(("CategoryType")));
		a.setAmountToShow(rs.getDouble(("AmountToShow")));
		a.setIndexOf(index);
		return a;
	}
}
