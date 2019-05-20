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
public class Ej11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int poblIni = 312032486;
	int segundosAño = 365 * 24 * 60 * 60;
	int nacimPorAño = segundosAño / 7;
	int muerPorAño= segundosAño / 13;
	int immigrantesPorAño = segundosAño / 45;
        System.out.print("Ingrese número de años: ");
	int años = entrada.nextInt();
        int poblacion = poblIni + años * (nacimPorAño + immigrantesPorAño - muerPorAño);
        System.out.print("La poblacion en " + años + " años es de " + poblacion +" personas");
    }
}
