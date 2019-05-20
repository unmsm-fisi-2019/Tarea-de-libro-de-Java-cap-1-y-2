/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabocap2;
import java.util.Scanner;
/**
 *
 * @author Eric
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celcius:");
        
        double Celsius = entrada.nextDouble();
        
        double Fahrenheit = ( 9.0 / 5 ) * Celsius + 32;
                
        System.out.println("La temperatura es:" + Fahrenheit);
        
    }
}
