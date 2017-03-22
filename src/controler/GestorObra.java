package controler;

import java.util.ArrayList;

import model.Obra;

public class GestorObra {

ArrayList<Obra> listaObra;
	
	public GestorObra(String tipoobra, String nomeartista, String titulo, String categoria, String data){
		this.listaObra = new ArrayList<Obra>();
	}

	public void addObra(String tipoobra, String nomeartista, String titulo, String categoria, String data){
		Obra o = new Obra (tipoobra, nomeartista, titulo,categoria, data);
		listaObra.add(o);
		
	}
	
	
	
	
	

}






