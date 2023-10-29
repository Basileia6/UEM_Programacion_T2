public class Direccion {
    /*
    Ejercicio para mostrar la dirección de una persona con el formato de uan carta, se muestra:
        - Nombre Completo
        - Dirección
        - Códigopostal Localidad (Provincia)
        - Pais
     */

    public static void main(String[] args) {
        final String NOMBRE = "Beatriz Viejo Domínguez";
        final String CALLE = "Avenida Italia";
        final int NUM = 45;
        final int CP = 28932;
        final String LOCALIDAD = "Móstoles";
        final String PROVINCIA = "Madrid";
        final String PAIS = "España";
        System.out.println(NOMBRE);
        //Concatenamos los caracteres 'nº' ya que aunque no formen parte de la dirección lo hace más legible
        System.out.println(CALLE + " nº " + NUM);
        System.out.println(CP + " " + LOCALIDAD + " (" + PROVINCIA + ")");
        System.out.println(PAIS);
    }
}
