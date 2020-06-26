/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usar(Postres postre) {
    	if(postre.getClass()==Pastel.class) {
    		System.out.print(this.getClass()+": No se puede usar en pastel");
    		System.out.print("Usando leche entera");
    	}else {
    		System.out.print("usando leche deslactosada");
    	}
    }
        
        
}
