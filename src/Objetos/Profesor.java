
package Objetos;

public class Profesor extends Persona{
    
    public String idProfesor;

    public Profesor() {
    }

    public Profesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor(String idProfesor, String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }
    
     public boolean equals (Object obj) {

        if (obj instanceof Profesor) {

            Profesor tmpProfesor = (Profesor) obj;

            if (super.equals(tmpProfesor) && this.idProfesor.equals(tmpProfesor.idProfesor) ) {

                return true; } else { return false; }

        }  else { return false; }
    }
     public String toString (){
        String mensaje="El profesor se llama "+nombre+" "+apellido+" con "+edad+" años " ;
        return mensaje;
    }
    
}
