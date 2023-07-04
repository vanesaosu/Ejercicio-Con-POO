/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;


public class Alumno {
    int id;
    String nombre;
    String apellido;
    String Id;
     
    //Este es un constructor vacío
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    
    
    
    
    public void mostrarNombre(){
        System.out.println("mi nombre es: ");
        
    }
    /*public void saberNota( double calificaciones){
        double calificaiones = 0;
        if(calificaiones >= 6){
            System.out.println("Aprobo la materia");
        }else{
            System.out.println("Desaprobo!");
        }
    }*/
}
