/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

public class Reflexion {

     
    public static void main(String[] args) {
   
 try {
   Class p = Class.forName("Persona");
    
   try {
    Persona pp = (Persona) p.newInstance();
     
    pp.setNombre("Carlos");
    pp.setApellido("González");
     
    System.out.println(pp.toString());
     
   } catch (InstantiationException | IllegalAccessException e) {
   }
    
 } catch (ClassNotFoundException e) {
  }
         
         
         
 }  
}
        
  
    
    

