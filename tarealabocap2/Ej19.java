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
public class Ej19 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer punto del triángulo: ");
	double x1 = entrada.nextDouble();
	double y1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo punto del triángulo: ");
        double x2 = entrada.nextDouble();
	double y2 = entrada.nextDouble();
        System.out.print("Ingrese el tercer punto del triángulo: ");
        double x3 = entrada.nextDouble();
	double y3 = entrada.nextDouble();
	double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2d);
	System.out.print("El área del triángulo es : " + area);
	}

}
