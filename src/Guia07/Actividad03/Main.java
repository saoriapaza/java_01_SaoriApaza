
package Guia07.Actividad03;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        Operacion op = new Operacion();
        op.sumar(n1, n2);
    }
    
}
