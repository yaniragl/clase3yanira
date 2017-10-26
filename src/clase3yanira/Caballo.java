/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3yanira;

/**
 *
 * @author ceduc
 */
public class Caballo 
{
    String altura;
    String color;
    String peso;
    String raza;
  int patas= 4, edad;
  // metodo contructor
  public Caballo(String nuevoNombre)
  {
      raza = nuevoNombre;
  } 
  //Etodos get y set de la clase
  public void relinchar()
{

} 
public String obtenerRaza()
  
{
    //Sentencia obligatoria de retorno
    return raza; 
}
 public int obtenerEdad()
{
    //Sentencia obligatoria de retorno   
    return edad;
}

    
}