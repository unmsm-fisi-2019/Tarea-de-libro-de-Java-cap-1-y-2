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
public class Ej13 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el ahorro mensual : ");
        double Ahorro = entrada.nextDouble();
	double Total = Ahorro * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total = (Ahorro + Total) * (1 + 0.00417);
		Total *= 100;
		Total = (int) (Total) / 100.0;
        System.out.println("Dentro de seis meses la cuenta tendra $" + Total);
    }
}
