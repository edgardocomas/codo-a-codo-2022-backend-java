package ar.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection  getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&userSSL=false";
		String username = "root";
		String password = "root";
		String driverName = "com.mysql.cj.jdbc.Driver";   //mySqul ! postrges
		// control de errores
		Connection con=null;
		try {
			Class.forName(driverName); // carga en memoria el driver
			con = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace(); // se que paso o porque falllo
		}
		return con;
	}
	public static void main(String[] args) {
		Connection con = AdministradorDeConexiones.getConnection();
		if (con != null) {
			System.out.println("conexion OK");
		}else {
			System.err.println("conexion fail");
		}
	}

}
