/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabocap1;
import java.util.Scanner;
/**
 *
 * @author Eric
 */
public class Ej8 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi=3.141619;
        double radio;
        System.out.println("Ingrese el radio");
        radio=entrada.nextDouble();
        double area = radio*radio*pi;
        double perimetro = 2*radio*pi;
        System.out.println("El area es:" +area);
        System.out.println("El perimetro es:" +perimetro);
}
}