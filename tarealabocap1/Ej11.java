/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabocap1;

/**
 *
 * @author Eric
 */
public class Ej11 {
    public static void main(String[] args) {
        int poblacion = 312032486;
        int año=5;
        int dia=año*365;
        int hora=dia*24;
        int minuto=hora*60;
        int segundo=minuto*60;
        int nacimiento=segundo/7;
        int muerte=segundo/13;
        int inmigrante = segundo/45;
        int Poblacion=poblacion+nacimiento-muerte+inmigrante;
        System.out.println("La poblacion en 5 años es:" +Poblacion);
    }
}
