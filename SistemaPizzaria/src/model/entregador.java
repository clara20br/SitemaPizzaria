package model;

public class entregador {
private	String nome;
private String placaMoto;
private String telefone;
	public entregador(String nome, String placaMoto, String telefone) {
		this.nome = nome;
		this.placaMoto = placaMoto;
		this.telefone = telefone;
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlacaMoto() {
		return placaMoto;
	}
	public void setPlacaMoto(String placaMoto) {
		this.placaMoto = placaMoto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void exibirInfo() {
		System.out.println( "entregador [nome=" + nome + ", placaMoto=" + placaMoto + ", telefone=" + telefone + "]");
	}


	
}