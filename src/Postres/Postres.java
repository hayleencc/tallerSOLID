package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postres {
	 protected String sabor;
	 protected double precioParcial;
	 protected ArrayList<Aderezo> aderezos;
	 
	
	 
	 Postres(String sabor,double precioParcial){
		 aderezos= new ArrayList<>();
		 this.sabor = sabor;
		 this.precioParcial = precioParcial;
	 }
	 
	 public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	    }

	 public static void anadirAderezoPostre(Postres p,Aderezo aderezo){
	        p.getAderezos().add(aderezo);
	    }

	   public static void quitarAderezoPostre(Postres p,Aderezo aderezo){
	        p.getAderezos().remove(aderezo);
	    }
	 
	 
	   
}
