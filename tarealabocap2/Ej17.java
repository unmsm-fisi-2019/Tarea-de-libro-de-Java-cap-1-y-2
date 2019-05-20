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
public class Ej17 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la temperatura en  Fahrenheit  entre -58°F y 41°F: ");
		double ta = entrada.nextDouble();
		System.out.print("Ingrese la velocidad del viento (>=2) en millas por hora : ");
		double v = entrada.nextDouble();
		double windChill = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
		System.out.println("El indice de sensacion termica es : " +windChill);
	}
}
