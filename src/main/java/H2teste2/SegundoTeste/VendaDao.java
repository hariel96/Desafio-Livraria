 package H2teste2.SegundoTeste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendaDao {

public Venda buscaPorId(int id) {
		
		Venda venda = new Venda();
	
		try (Connection conn = conexao.getConexao()) {
 
			String sql = "SELECT IDVENDA, DATA, TOTAL, IDCLIENTE FROM VENDA WHERE IDVENDA = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				venda.setIdVenda(id);
				venda.setData(rs.getDate(2).toLocalDate());
				venda.setTotal(rs.getDouble(3));
				Cliente cliente = new Cliente();
				venda.setCliente(cliente);
				
				
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return venda;
	}
	
}
