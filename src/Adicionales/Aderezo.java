package Adicionales;

public abstract class Aderezo {
	protected String nombre;
	
	public Aderezo(String nom) {
		this.nombre=nom;
	}
	
	protected abstract void setNombre(String nom);

	@Override
	public String toString() {
		return "Aderezo [nombre=" + nombre.toUpperCase() + "]";
	}
	
	
		
	
	
	
}
