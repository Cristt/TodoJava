/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Objetos.Persona;
import Objetos.Profesor;

public class Equals_Hash_Clone_String{

    public static void main(String[] args) {
        
        Persona persona1= new Persona("Pepe", "Garcia", "33");
        Persona persona2= new Persona("Pepe", "Garcia", "33");
        Persona persona3= new Persona("Pepo", "Rodriguez", "77");
        Profesor profesor1= new Profesor("30", "Daniela", "Martin", "30");
        Profesor profesor2= new Profesor("30", "Daniela", "Martin", "30");
        Profesor profesor3= new Profesor("31", "Rodrigo", "Rebolledo", "40");
       
        
        System.out.println ("¿Son iguales la persona1 y la persona2? " + persona1.equals(persona2) );

        System.out.println ("¿Son el mismo objeto la persona1 y la persona2? " + (persona1 == persona2) ); 

        System.out.println ("¿Son iguales la persona1 y la persona3? " + persona1.equals(persona3) );  

        System.out.println ("¿Son iguales el profesor1 y el profesor2? " + profesor1.equals(profesor2) );

        System.out.println ("¿Son iguales el profesor1 y el profesor3? " + profesor1.equals(profesor3) );
        
        System.out.println(persona2.hashCode());

        System.out.println(profesor3.hashCode());
        
        Persona persona4=persona3.clone();
        System.out.println(persona4);
        System.out.println(profesor1.toString());
        System.out.println(profesor1.getClass());
        
    }

      
      
}
    

