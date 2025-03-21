/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad02;

/**
 *
 * @author HP
 */
public class Saludar {
    // Método con valor de retorno
    public String saludar(String nombre) {
        String saludo = "Hola " + nombre;
        return saludo;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Saludar para llamar a `saludar`
        Saludar objeto = new Saludar();
        String saludo = objeto.saludar("Saori");

        // Mostrar el resultado
        System.out.println(saludo);
    }
}

