package H2teste2.SegundoTeste;

public class iItensVenda {

	private Livro livro;
	private Venda venda;
	private double subtotal;
	private int qtd;
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public double getSubtotal() {
		this.subtotal = this.livro.getPreco()*this.qtd;
		return subtotal;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
