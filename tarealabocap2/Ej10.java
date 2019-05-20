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
public class Ej10 {
     public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de agua en Kilogramos: ");
    double kilog = entrada.nextDouble();
    System.out.print("Ingrese la temperatura inicial : ");
    double tem1 = entrada.nextDouble();
    System.out.print("Ingrese la temperatura final : ");
    double tem2 = entrada.nextDouble();
    double E = kilog * (tem2 - tem1) * 4184;
    System.out.println("La energia necesaria es : " + E);
     }
}
