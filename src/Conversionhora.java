import java.util.Scanner;

public class Conversionhora {
    /*
    Programa que convierta segundos en horas, minutos y segundos.
     */

    public static void main (String[] args){

        final int LX = 60;

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el número de segundos que quiere convertir");
        int segundosleidos = reader.nextInt();

        int segundos = segundosleidos % LX;
        int minutos = segundosleidos / LX;
        int horas = minutos / LX;
        minutos = minutos % LX;

        System.out.println("Nº segundos: " + segundosleidos);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
