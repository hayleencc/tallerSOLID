package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postres {
	 protected String sabor;
	 protected double precioParcial;
	 public static ArrayList<Aderezo> aderezos;
	 
	
	 public Postres(String sabor){
		 aderezos= new ArrayList<>();
		 this.sabor = sabor;
	 }
	 
	 public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	    }

	 
	    public void setAderezos(ArrayList<Aderezo> aderezos) {
	        this.aderezos = aderezos;
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
	 
	 public double getPrecioParcial() {
	        return precioParcial;
	    }
}
