package Procesos;

public class ManejadorDePrecio {
	
	protected double precioParcial;
	
	public ManejadorDePrecio(double precio) {
		this.precioParcial=precio;
	}
	
	
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(Postres.Postres.aderezos.size()*0.50);
        return precioFinal;
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

}
