package misc;

import java.util.ArrayList;

import model.Exposicao;
import model.Obra;

public class MData {

	public static Obra obr = new Obra ("Miguel Angelo", "Juizo Final", "Renascentismo", "Escultura", "15410");
	public static Exposicao exp = new Exposicao ("O Renascentismo", "20/01/2017", "31/05/2017", 15 , 9.5);
	public static ArrayList <Obra> arobr = new ArrayList<Obra>();
	public static ArrayList <Exposicao> arexp = new ArrayList<Exposicao>();
	
	public static void filldata(){
	arobr.add(obr);
	arexp.add(exp);
	exp.getObra().add(obr); 
	}

}
