import java.util.Scanner;

public class Operadores {
    /*
    Programa que lee 2 variables enteras por pantalla y realiza y muestra las siguientes operaciones
        - Suma
        - Resta
        - Multiplicación
        - División entera
        - Resto entero
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int primero = reader.nextInt();
        System.out.println("Introduzca el segundo número");
        int segundo = reader.nextInt();

        int suma = primero + segundo;
        int resta = primero - segundo;
        int multiplicacion = primero * segundo;
        int division = primero / segundo;
        int resto = primero % segundo;

        System.out.println("La suma de " + primero + " y " + segundo + " es: " + suma);
        System.out.println("La resta de " + primero + " y " + segundo + " es: " + resta);
        System.out.println("La multiplicacion de " + primero + " y " + segundo + " es: " + multiplicacion);
        System.out.println("La division de " + primero + " y " + segundo + " es: " + division);
        System.out.println("El resto de la división de " + primero + " y " + segundo + " es: " + resto);
    }
}
