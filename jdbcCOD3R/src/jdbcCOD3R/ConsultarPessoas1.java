package jdbcCOD3R;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = ConnectionFactory.getConexao();
		
		String sql = "SELECT * FROM pessoas";
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		while (rs.next()) {
			int codigo = rs.getInt("codigo");
			String nome = rs.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() +" --- "+ p.getNome());
		}
		
		
		st.close();
		conn.close();

	}

}
