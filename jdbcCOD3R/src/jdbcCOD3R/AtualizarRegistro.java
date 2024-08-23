package jdbcCOD3R;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizarRegistro {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.getConexao();
		
		
		PreparedStatement ps = conn.prepareStatement(
				"UPDATE pessoas SET "
				+ "nome = ? WHERE "
				+ "codigo = ?");
		
		ps.setString(1, "Derek Diniz");
		ps.setInt(2, 1);
		
		int linhasAfetadas = ps.executeUpdate();
		
		System.out.println("Pronto!, linhas afetadas: "+linhasAfetadas);
		
		
		ps.close();
		conn.close();
		
		
		

	}

}
