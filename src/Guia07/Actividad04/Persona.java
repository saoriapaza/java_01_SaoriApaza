/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad04;

/**
 *
 * @author HP
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //metodo Constructor
    public Persona(String _nombre,int _edad){
    
        nombre =_nombre;
        edad =_edad;
    }
    
    public void mostrarDatos(){
    
        System.out.println("El nombre es: "+nombre);
        System.out.println("Su edad es:"+edad);
    }
}
