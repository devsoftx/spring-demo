package pe.gastobien.app.layer.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.gastobien.app.domain.User;
import pe.gastobien.app.layer.dao.interfaces.UserDao;

@Repository
public class UserDaoImpl extends AccesoDB implements UserDao {

	@Override
	public void save(User user) {

	}

	@Override
	public void update(User user) {

	}

	@Override
	public void delete(User user) {

	}

	@Override
	public User getById(User user) {
		Connection cn = null;
		User entity = null;

		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_GetUserById](?)}");
			invocacion.setInt(1, user.getUserID());
			ResultSet respuesta = invocacion.executeQuery();
			if (respuesta.next()) {
				entity = rowToBean(respuesta);
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
		return entity;
	}

	@Override
	public List<User> getAll(User user) {
		return null;
	}

	@Override
	public User getUserByLogin(String login) {
		Connection cn = null;
		User entity = null;

		try {
			cn = AccesoDB.getConnection();
			CallableStatement invocacion = cn
					.prepareCall("{call [dbo].[usp_GetUserByLogin](?)}");
			invocacion.setString(1, login);
			ResultSet respuesta = invocacion.executeQuery();
			if (respuesta.next()) {
				entity = rowToBean(respuesta);
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
		return entity;
	}

	@Override
	public Boolean existUser(String login) {
		return true;
	}

	private User rowToBean(ResultSet rs) throws SQLException {
		User a = new User();
		a.setUserID(rs.getInt(("UserID")));
		a.setUserName((rs.getString("UserName")));
		a.setLogin((rs.getString("Login")));
		a.setPassword((rs.getString("Password")));
		a.setEmail((rs.getString("Email")));
		a.setAlternativeEmail((rs.getString("AlternativeEmail")));
		a.setSecretQuestion((rs.getString("SecretQuestion")));
		a.setSecretAnswer((rs.getString("SecretAnswer")));
		a.setIdPhone((rs.getString("IDPhone")));
		a.setSessionKey((rs.getString("SessionKey")));
		a.setPhone((rs.getString("Phone")));
		a.setLastName((rs.getString("LastName")));
		a.setUserCreationDate(rs.getDate("UserCreationDate"));
		a.setTriesNumber(Integer.parseInt(rs.getString("TriesNumber")));
		a.setLastUpdate((rs.getDate("LastUpdate")));
		a.setLastRemoteHost((rs.getString("LastRemoteHost")));
		a.setUserCurrency((rs.getString("UserCurrency")));
		a.setLanguage((rs.getString("Language")));
		a.setCurrentMonth(Integer.parseInt(rs.getString("CurrentMonth")));
		a.setCurrentYear(Integer.parseInt(rs.getString("CurrentYear")));
		a.setReportsPerMonth(Integer.parseInt(rs.getString("ReportsPerMonth")));
		return a;
	}
}