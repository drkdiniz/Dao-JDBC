package jdbcCOD3R;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY, "
				+ "nome VARCHAR(80) NOT NULL "
				+")";
				
		Statement st = conn.createStatement();
		st.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		conn.close();

	}

}
