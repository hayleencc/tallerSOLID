# tallerSOLID
1. Se esta violando el OCP para solucionarlo se creo la clase Postres ya que eso nos 
da la opcion a que a futuro se puedan imnplemnetar otro tipo de postres. Lo que hicimos
fue heredar las clases existentes de Helado y Pastel de la nueva clase padre Postre y 
en ella creamos todas las variables que se van a necesitar para los postres como nombre,
sabor, precioParcial y una lista de aderesos 

2. Se esta violando el SRP ya que se estan redundando las responsabilidades en cada 
clase, lo que hicimos para solucionarlo y cumplir con el principio fue eliminar la 
clase OperacionesAderezo y dejamos el método en clase Postres para que pueda ser 
aplicado en cada uno de los postres que se ofrecen

3. Se esta violando el OCP ya que si en algun momento se quiere crear otro postre
deberiamos modificar la clase completa entonces para evitar eso y solucionarlo creamos 
una nueva clase llamada ManejadorDePrecio para facilitar estos metodos para cada postre y 
esta clase es la que se encarga de presentar los precios de los postres

4. Se esta violando el OCP ya que no se popdria extender las opciones y se deberia 
empezar a modificar el codgido y eso generaria errores globales causando problemas por 
lo cual la clase Aderezos de tipo enum se la hizo Abstracta con el fin de tener un modelo
para cada aderezo

5. Se esta violando el DIP ya que esta dependiendo de la clase LecheDesLactosada y 
no puede funcionar por si sola. Para corregir el error cada vez que el pastel fuera hecho con
leche deslactosada no se detenga el programa sino que lo cambie a leche entera y muestre el
mensaje "El pastel se esta haciendo con leche entera"
