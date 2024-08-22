package jdbcCOD3R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost";
		String usuario = "derek";
		String senha = "acido11";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement st = conexao.createStatement();
		st.execute(
				"CREATE DATABASE IF NOT EXISTS curso_java");
		
		
		
		System.out.println("Banco de dados criado com sucesso!");
		
		conexao.close();

	}

}
