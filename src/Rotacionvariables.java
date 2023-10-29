import java.util.Scanner;

public class Rotacionvariables {
    /*
    Programa que lee 5 variables enteras por pantalla y:
        - Las muestra según el orden en las que las ha leido
        - La rota una posición a la izquierda y las vuelve a mostrar
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int primero = reader.nextInt();
        System.out.println("Introduzca el segundo número");
        int segundo = reader.nextInt();
        System.out.println("Introduzca el tercer número");
        int tercero = reader.nextInt();
        System.out.println("Introduzca el cuarto número");
        int cuarto = reader.nextInt();
        System.out.println("Introduzca el quinto número");
        int quinto = reader.nextInt();

        //Primero se muestran en el orden en las que se ha leido
        System.out.println(primero + " " + segundo + " " + tercero + " " + cuarto + " " + quinto);

        int aux = primero;
        primero = segundo;
        segundo = tercero;
        tercero = cuarto;
        cuarto = quinto;
        quinto = aux;

        //Después de la rotación se vuelven a mostrar
        System.out.println(primero + " " + segundo + " " + tercero + " " + cuarto + " " + quinto);


    }
}
