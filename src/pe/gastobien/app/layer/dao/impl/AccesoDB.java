package pe.gastobien.app.layer.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
	public static Connection getConnection() throws SQLException {
		Connection cn = null;
		try {
			String driver = "net.sourceforge.jtds.jdbc.Driver";
			String url = "jdbc:jtds:sqlserver://JQUIROZ-LT:1433/PERSONAL_CONT";
			String user = "sa";
			String password = "123456";
			Class.forName(driver);
			cn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new SQLException("Falta cargar el driver.");
		} catch (Exception e) {
			throw new SQLException("Error en la conexion con la base de datos.");
		}
		return cn;
	}
}
