package model;

import java.util.ArrayList;

public class Exposicao {
ArrayList<Obra> obra;
private String nomeesposicao;

private String dataincio;
private String datafim;


int quatvisitantes;

public ArrayList<Obra> getObra() {
	return obra;
}

public void setObra(ArrayList<Obra> obra) {
	this.obra = obra;
}

double preco;

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public Exposicao(String nomeesposicao, String dataincio, String datafim, int quatvisitantes, double preco) {
	super();
	this.nomeesposicao = nomeesposicao;
	
	this.dataincio = dataincio;
	this.datafim = datafim;
	this.quatvisitantes = quatvisitantes;
	this.preco = preco;
}

public String getNomeesposicao() {
	return nomeesposicao;
}

public void setNomeesposicao(String nomeesposicao) {
	this.nomeesposicao = nomeesposicao;
}

public String getDataincio() {
	return dataincio;
}

public void setDataincio(String dataincio) {
	this.dataincio = dataincio;
}

public String getDatafim() {
	return datafim;
}

public void setDatafim(String datafim) {
	this.datafim = datafim;
}

public int getQuatvisitantes() {
	return quatvisitantes;
}

public void setQuatvisitantes(int quatvisitantes) {
	this.quatvisitantes = quatvisitantes;
}



	 
	 
	 
	 
}
