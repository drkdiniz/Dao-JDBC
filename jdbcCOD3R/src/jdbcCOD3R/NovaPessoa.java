package jdbcCOD3R;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		
		String nome = sc.nextLine();
		
		Connection conn = ConnectionFactory.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		
		ps.execute();
		
		System.out.println("Pessoa incluída com sucesso!");
		
		sc.close();
	}

}
