package basic.c03_strings;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String nombre = "Dario";
        String apellido = "Bellini";
        System.out.println(nombre + " " + apellido);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(nombre.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(nombre.charAt(0));
        System.out.println(apellido.charAt(apellido.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(nombre.toLowerCase());
        System.out.println(apellido.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(nombre.contains("ar"));

        // 6. Formatea un string con un entero.
        int e = 38;
        System.out.println(String.format("Hi %s, tengo %d.", nombre, e));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Es para eliminar los espacios ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Es para cambiar los lugares en blanco ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(nombre.equals(apellido));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(nombre.length() == apellido.length());
    }
}
