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
public class Ej3 {
     public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un valor en pies: ");
	double pies = entrada.nextDouble();
        double metros = pies * 0.305;
    System.out.println(pies + " pies es " + metros + " metros");
    } 
    
}
