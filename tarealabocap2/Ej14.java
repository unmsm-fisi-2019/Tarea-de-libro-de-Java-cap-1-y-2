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
public class Ej14 {
     public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el peso en libras: ");
    double pesoLibras= entrada.nextDouble();
    System.out.println("Ingrese la altura en pulgadas: ");
    double anchoPies = entrada.nextDouble();
    double peso = pesoLibras * 0.45359237;
    double ancho = anchoPies * 0.0254;
    double BMI = (peso / (ancho * ancho));
    System.out.println("El indice de masa corporal es: " + BMI);
    }
}
