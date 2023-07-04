/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author USER
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno alum1 = new Alumno();
       Alumno Alum2 = new Alumno(7,"Vanesa","Ozuna");
       
       System.out.println("el id del alumno es: "+ Alum2.getId());
       System.out.println("El nombre es: "+ Alum2.getNombre());
       System.out.println("El apellido es: "+ Alum2.getApellido());
       
       alum1.setId(9);
       alum1.setNombre("cleetus");
       alum1.setApellido("ozuna");
       
       System.out.println("----------");
       System.out.println("el id del alumno es: "+ alum1.getId());
       System.out.println("El nombre es: "+ alum1.getNombre());
       System.out.println("El apellido es: "+ alum1.getApellido()); 
       
        System.out.println("----------");
       //Usare el set para modificar el Id
       Alum2.setId(35);
       System.out.println("el id del alumno es: "+ Alum2.getId());
       System.out.println("El nombre es: "+ Alum2.getNombre());
       System.out.println("El apellido es: "+ Alum2.getApellido());
    }
    
}
