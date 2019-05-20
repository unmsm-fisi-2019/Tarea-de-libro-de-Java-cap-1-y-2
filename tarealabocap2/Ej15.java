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
public class Ej15 {
     public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese el valor de  x1 y y1: ");
	double x1 = entrada.nextDouble();
	double y1 = entrada.nextDouble();
	System.out.print("Ingrese el valor de x2 y y2: ");
	double x2 = entrada.nextDouble();
	double y2 = entrada.nextDouble();		
        double Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre dos puntos es " + Distancia);
	}
}
