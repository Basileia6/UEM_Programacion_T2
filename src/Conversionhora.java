import java.util.Scanner;

public class Conversionhora {
    /*
    Programa que convierta segundos en horas, minutos y segundos.
     */

    public static void main (String[] args){

        final int ses = 60;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el número de segundos que quiere convertir");
        int segundosleidos = reader.nextInt();

        int segundos = segundosleidos % ses;
        int minutos = segundosleidos / ses;
        int horas = minutos / ses;
        minutos = minutos % ses;

        System.out.println("Nº segundos: " + segundosleidos);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
