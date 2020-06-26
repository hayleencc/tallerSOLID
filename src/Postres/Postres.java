package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postres {
	 protected String sabor;
	 protected double precioParcial;
	 public static ArrayList<Aderezo> aderezos;
	 
	
	 public Postres(String sabor){
		 this.sabor = sabor;
	 }
	 
	 
	 public void anadirAderezoPostre(Aderezo aderezo){
	        aderezos.add(aderezo);
	    }

	   public void quitarAderezoPostre(Aderezo aderezo){
	        aderezos.remove(aderezo);
	    }
	 
	 public double getPrecio() {
		 return this.precioParcial;
	 }
	   
}
