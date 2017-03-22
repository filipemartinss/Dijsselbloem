package model;

public class Obra {

	 private String tipoobra;
	 private String nomeartista;
	 private String titulo;
	 private String categoria;
	 private String Data;
	
	 public Obra(String tipoobra, String nomeartista, String titulo, String categoria, String data) {
		super();
		this.tipoobra = tipoobra;
		this.nomeartista = nomeartista;
		this.titulo = titulo;
		this.categoria = categoria;
		Data = data;
	}
	
	public String getTipoobra() {
		return tipoobra;
	}
	public void setTipoobra(String tipoobra) {
		this.tipoobra = tipoobra;
	}
	public String getNomeartista() {
		return nomeartista;
	}
	public void setNomeartista(String nomeartista) {
		this.nomeartista = nomeartista;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	 
}
