/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author yaneth
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 70;
        int sum = 0;
        
        for( int k=1; k <= max; k++ )
            sum = sum + k;
        System.out.println("La suma de los 70 primeros numeros: " + sum);
    }   
}