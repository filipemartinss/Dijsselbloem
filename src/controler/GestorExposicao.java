package controler;

import java.util.ArrayList;

import model.Exposicao;

public class GestorExposicao {

	ArrayList<Exposicao> listaExposicao;
	
	public GestorExposicao(String nomeesposicao, String obra, String dataincio, String datafim, int quatvisitantes, double preco){
		this.listaExposicao = new ArrayList<Exposicao>();
	}

	public void addExposicao(String nomeesposicao, String dataincio, String datafim, int quatvisitantes, double preco){
		Exposicao e = new Exposicao(nomeesposicao, dataincio, datafim, quatvisitantes, preco);
		listaExposicao.add(e);
		
	}


}
