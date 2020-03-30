package H2teste2.SegundoTeste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static Connection getConexao() {
		
		
		try {
			return DriverManager.getConnection("jdbc:h2:~/bananaSplit2", "sa", "");
			
		} catch (SQLException e) {
			throw new RuntimeException (e);
			
		}
		
	}
	
}
