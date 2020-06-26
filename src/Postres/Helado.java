/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postres{
	
	ArrayList<Helado> helados;
	
    public Helado(String sabor){
       super(sabor);
       this.precioParcial = 7.85;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
}
