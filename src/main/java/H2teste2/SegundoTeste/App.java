package H2teste2.SegundoTeste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class App 
{
	public static void main( String[] args )
    {
    	System.out.println("Inicio da execução");
    	try(Connection conn = DriverManager.getConnection("jdbc:h2:~/bananaSplit2", "sa", "")) {
    		
    		Class.forName("org.h2.Driver");
    		
//						Para ler as informações da tabela Itens da Venda
    		
			String ler = "SELECT * from itens_da_venda";
			PreparedStatement preparaLer = conn.prepareStatement (ler);
			preparaLer.execute();
			
    		
    		
    		
    		
    		
//						Para inserir novos dados na tabela itens da venda
    		
    		String inserir = "INSERT INTO itens_da_venda ( idvenda , idlivro , qtd , subtotal ) VALUES ( (select idvenda from venda where "
    				+ "idcliente = (select idcliente from cliente where nome like 'tulio')), (select idlivro from livro where titulo like"
    				+ " 'as flores do mal'), 40, (select sum(40 * preco) from livro where titulo like 'as flores do mal'));";
    		PreparedStatement preparaInserir = conn.prepareStatement (inserir);
    		preparaInserir.execute();
    		
    		
    		
    		
    		
    		
//						Para alterar dados na tabela itens da venda
    		
			String alterar = "UPDATE itens_da_venda SET qtd=90 where qtd=20";		
			PreparedStatement preparaAlterar = conn.prepareStatement (alterar);
			preparaAlterar.execute();
    		
    		
    		
    		
    		
//						Para deletar os dados na tabela itens da venda
    		
			String deletar = "DELETE FROM itens_da_venda";		
			PreparedStatement preparaDeletar = conn.prepareStatement (deletar);
			preparaDeletar.execute();
    		
    		
    		
    		
//						Ordena os itens mais vendidos
    		
    		String maisVendido = " SELECT sum(g.qtd) soma, l.titulo\r\n" + 
    				"FROM itens_da_venda g\r\n" + 
    				"JOIN livro l ON l.idlivro = g.idlivro\r\n" + 
    				"GROUP BY l.titulo \r\n" + 
    				"ORDER BY sum(g.qtd) desc,l.titulo;";
    		PreparedStatement preparaMaisVendido = conn.prepareStatement (maisVendido);
    		preparaMaisVendido.execute();
    		
//    		System.out.println(preparaMaisVendido.execute());
    		
    		
    		
    	
    		
    		
    		conn.close();
    		
		} catch (Exception e) {
			e.printStackTrace();
		} 
    	System.out.println("Fim da execução");
 
    }
}