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
public class Ej20 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el saldo y la tasa de interes (por ejemplo 3 por 3%): ");
	double Balance = entrada.nextDouble();
	double InteresAnualR = entrada.nextDouble();
	double interes = Balance * (InteresAnualR/ 1200);
	System.out.println("El interes es :" + interes);
        }    
}
