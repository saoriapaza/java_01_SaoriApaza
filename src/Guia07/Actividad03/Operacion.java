/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad03;

import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Operacion {
    //atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodo de suma de numeros
    public void sumar(int numero1, int numero2){
        suma = numero1+numero2;   
    }
    //metodo de restar de numeros
    public void resta(int numero1, int numero2){
        resta = numero1*numero2;    
    }
    //metodo de multiplicacion de numeros
    public void multiplicacion(int numero1, int numero2){
        multiplicacion = numero1*numero2;   
    }
    //metodo de division de numeros
    public void division(int numero1, int numero2){
        division = numero1/numero2; 
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma); 
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
    
}
