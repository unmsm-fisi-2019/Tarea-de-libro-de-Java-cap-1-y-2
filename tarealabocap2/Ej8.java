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
public class Ej8 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la zona horaria de desplazamiento a GTM : ");
		int offset = entrada.nextInt();

		long TotalMiliSegundos = System.currentTimeMillis(); 

		long TotalSegundos=  TotalMiliSegundos/ 1000; 

		long SegundoActual= (int) (TotalSegundos % 60); 

		long TotalMinutos = TotalSegundos / 60; 

		long MinutoActual = (int) (TotalMinutos % 60);

		long TotalHoras = TotalMinutos / 60; 
		TotalHoras += offset;

		long HoraActual = (int) (TotalHoras % 24); 

		System.out.println("La hora actualmente es " + HoraActual + ":" + MinutoActual + ":" + SegundoActual);
    }  
}
