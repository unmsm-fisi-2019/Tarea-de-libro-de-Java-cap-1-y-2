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
public class Ej21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese la cantidad invertida: ");
	double inversion = entrada.nextDouble();
	System.out.println("Ingrese el porcentaje del interes anual: ");
        double ianual = entrada.nextDouble();
	double imensual = (ianual) / (12 * 100);
	System.out.println("Ingrese el número de año: ");
	int año = entrada.nextInt();
	double valor = inversion * (Math.pow((1 + imensual), (año * 12)));
	System.out.println("El valor total es de $" + valor);
    }
}
