package H2teste2.SegundoTeste;

public class Genero {

	private int idgenero;
	private String descricao;

	public Genero() {
	}

	public Genero(int idgenero, String descricao) {
		this.idgenero = idgenero;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Genero [idgenero=" + idgenero + ", descricao=" + descricao + "]";
	}

	public int getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
