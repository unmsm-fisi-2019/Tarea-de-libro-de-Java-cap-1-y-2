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
public class Ej9 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese la velocidad inicial: ");
    double v0 = entrada.nextDouble();
    System.out.print("Ingrese la velocidad final: ");
    double v1 = entrada.nextDouble();
    System.out.print("Ingrese el tiempo: ");
    double t = entrada.nextDouble();
    double acceleration = (v1 - v0) / t;
    System.out.println("La aceleracion media es : " + acceleration);
    }  
}
