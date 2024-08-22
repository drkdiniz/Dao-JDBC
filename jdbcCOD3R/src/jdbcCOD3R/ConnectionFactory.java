package jdbcCOD3R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConexao() {
		try {
			String url = "jdbc:mysql://localhost/curso_java";
			String usuario = "derek";
			String senha = "acido11";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
