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
public class Ej4 {
     public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor en libras: ");
	double libras= entrada.nextDouble();
        double kilogramos = libras * 0.454 ;
        System.out.println(libras + " libras es " + kilogramos+ " kilogramos");
    }
}
