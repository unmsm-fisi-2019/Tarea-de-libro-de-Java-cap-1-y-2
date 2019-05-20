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
public class Ej6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 1000:");
	int Numero = entrada.nextInt();
        int Suma = 0;
	do{
	Suma = Suma + (Numero % 10);
	Numero = Numero / 10;
        }
        while (Numero > 0 && Numero < 1000) ;
	System.out.println("La suma de dígitos es "+Suma );
    }
}
