package H2teste2.SegundoTeste;

public class Livro {
	private int idlivro;
	private String titulo;
	private double preco;
	private int estoque;
	private Genero genero;
	
	public Livro() {}
	
	
	
	@Override
	public String toString() {
		return "Livro [idlivro=" + idlivro + ", titulo=" + titulo + ", preco=" + preco + ", estoque=" + estoque
				+ ", genero=" + genero + "]";
	}



	public Livro(int idlivro, String titulo, double preco, int estoque, Genero genero) {
		this.idlivro = idlivro;
		this.titulo = titulo;
		this.preco = preco;
		this.estoque = estoque;
		this.genero = genero;
	}



	public int getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	
	
}
