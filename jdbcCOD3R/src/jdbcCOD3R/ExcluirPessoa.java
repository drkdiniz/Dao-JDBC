package jdbcCOD3R;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = ConnectionFactory.getConexao();
		
		PreparedStatement ps = conn.prepareStatement(
				"DELETE FROM  pessoas WHERE "
				+ "codigo = ?");
		
		ps.setInt(1, 2);
		
		int linhasAfetadas = ps.executeUpdate();
		
		System.out.println("Pronto! Linhas afetadas "+ linhasAfetadas);

	}

}
