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
public class Ej12 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese la velocidad : ");
	double v = entrada.nextDouble();
	System.out.print("Ingrese la aceleracion: ");
	double a = entrada.nextDouble();
	double longitud = Math.pow(v, 2) / (2 * a);
	System.out.println("La longitud mínima de la pista para el avión es : " + longitud);
    }
}
