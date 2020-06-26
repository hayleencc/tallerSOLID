package Procesos;

import Postres.Postres;

public class ManejadorDePrecio {
	
	protected double precioParcial;
	
	public ManejadorDePrecio(double precio) {
		this.precioParcial=precio;
	}
	
	
    public static double calcularPrecioFinal(Postres postres){
    	double precioFinal;
        precioFinal=(postres.getPrecioParcial()+(postres.getPrecioParcial()*0.12))+(postres.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postres postres){
        return "Precio Final: $ " + calcularPrecioFinal(postres);
    }

}
