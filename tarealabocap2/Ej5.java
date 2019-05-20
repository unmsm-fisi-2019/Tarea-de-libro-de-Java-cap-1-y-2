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
public class Ej5 {
     public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el subtotal: ");
    int subtotal = entrada.nextInt();
    System.out.println("Ingrese la tasa de propina: ");
    int tasaPropina = entrada.nextInt();
    double propina = (subtotal * tasaPropina * 1.0) / 100; 
    double total = subtotal + propina;
    System.out.println("La propina es $" + propina + " y el total " + total);
   } 
}
