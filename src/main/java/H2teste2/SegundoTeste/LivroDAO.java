package H2teste2.SegundoTeste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class LivroDAO {

	public Livro buscaPorId(int id) {
		
		Livro livro = new Livro();
	
		try (Connection conn = conexao.getConexao()) {
 
			String sql = "select IDLIVRO,TITULO,PRECO,ESTOQUE,IDGENERO from livro WHERE IDLIVRO = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				livro.setIdlivro(id);
				livro.setTitulo(rs.getString(2));
				livro.setPreco(rs.getDouble(3));
				livro.setEstoque(rs.getInt(4));
				Genero genero = new Genero();
				genero.setIdgenero(rs.getInt(5));
				livro.setGenero(genero);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return livro;
	}

	public List<Livro> buscaTodos() {

		return null;
	}

	public void atualiza(Livro livro) {
		
	}
	
	public void insere(Livro livro) {
		
		
	}
	

	public void remove(int id) {
		
		
	}
	
}
