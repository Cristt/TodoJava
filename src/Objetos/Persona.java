/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

public class Persona implements Cloneable{
    
    public String nombre;
    public String apellido;
    public String edad;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

     public boolean equals (Object obj) {

        if (obj instanceof Persona) {

        Persona tmpPersona = (Persona) obj;

            if (this.nombre.equals(tmpPersona.nombre) && this.apellido.equals(tmpPersona.apellido) &&

 this.edad == tmpPersona.edad) { return true; } else { return false; }

    } else { return false; }
}
    
     public Persona clone()   {

      Persona clon = new Persona(this.nombre,this.apellido,this.edad);

      return clon;
     
     
}
     
     
}
