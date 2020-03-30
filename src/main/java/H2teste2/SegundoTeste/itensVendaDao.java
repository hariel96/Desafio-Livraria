package H2teste2.SegundoTeste;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class itensVendaDao {

	public void insereItens(iItensVenda item) {

		try (Connection conn = conexao.getConexao()) {

			String sql = "INSERT INTO ITENS_DA_VENDA (IDVENDA, IDLIVRO,QTD, SUBTOTAL) VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, item.getVenda().getIdVenda());
			pstmt.setInt(2, item.getLivro().getIdlivro());
			pstmt.setInt(3, item.getQtd());
			pstmt.setDouble(4, item.getSubtotal());
			pstmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
