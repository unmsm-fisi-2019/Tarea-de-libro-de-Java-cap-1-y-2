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
public class Ej7 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int Min = 60 * 24;
	int Año = Min* 365;
	System.out.println("Ingrese el número de minutos: ");
	int Minutos = entrada.nextInt();
	int Años = Minutos/ Año;
	int Año1 = Minutos % Año;
	int Dia = Año1 / Min;
	System.out.println(Minutos + " minutos es aproximadamente " + Años + " años y " + Dia + " díass.");
    }
}
