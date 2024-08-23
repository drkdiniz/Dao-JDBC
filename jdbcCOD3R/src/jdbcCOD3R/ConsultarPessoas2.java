package jdbcCOD3R;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome que gostaria de pesquisar: ");
		String str = sc.next();
		
		Connection conn = ConnectionFactory.getConexao();
		
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%"+str+"%");
		ResultSet rs = ps.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		while (rs.next()) {
			int codigo = rs.getInt("codigo");
			String nome = rs.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() +" --- "+ p.getNome());
		}
		
		
		sc.close();
		ps.close();
		conn.close();

	}

}

