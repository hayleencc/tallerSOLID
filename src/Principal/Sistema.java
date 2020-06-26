/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.ArrayList;

import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {

    
    public static void main(String [ ] args){
    // Producir un helado de vainilla y una torta de chocolate, 
    // a ambos agregarles CREMA y FRUTILLAS
    // y cambiar el tipo de leche por Leche Deslactosada
    ArrayList<Postres> arrPostres = new ArrayList<>();
    ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
    
    // Producir Helado
    Postres helado_vainilla = new Helado("Vainilla");
    arrPostres.add(helado_vainilla);
    // Producir Pastel
    Postres pastel_chocolate = new Pastel("Chocolate");
    arrPostres.add(pastel_chocolate);
    
    arrPostres.forEach(postre -> {
        postre.anadirAderezoPostre(new Crema());
        postre.anadirAderezoPostre(new Frutilla());
        System.out.println(postre);
        LecheEntera leche = new LecheDeslactosada();
        mnj_leche.cambiarTipoLeche(postre);
        System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
    });        
    
}


}
