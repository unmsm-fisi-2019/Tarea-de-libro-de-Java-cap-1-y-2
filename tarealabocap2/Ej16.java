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
public class Ej16 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese el lado del hexagono : ");
	double lado = entrada.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(lado , 2);
	System.out.println("El area del hexagono es :" + area);
	}
}
