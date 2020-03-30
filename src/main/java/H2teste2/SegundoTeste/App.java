package H2teste2.SegundoTeste;

public class App {
	public static void main(String[] args) {

		
		Livro livro = new LivroDAO().buscaPorId(2);
		Venda venda = new VendaDao().buscaPorId(1);
		//	System.out.println(new LivroDAO().buscaPorId(1));
		
		iItensVenda item = new iItensVenda();
		item.setLivro(livro);
		item.setQtd(5);
		item.setVenda(venda);
		
		new itensVendaDao().insereItens(item);
	}
}