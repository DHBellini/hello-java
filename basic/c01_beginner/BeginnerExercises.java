package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Dario";
        System.out.println(nombre);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 38;
        System.out.println(edad);

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.91;
        System.out.println(altura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programar = true;
        System.out.println(programar);

        // 5. Declara una constante con tu email.
        final String email = "dariobellini.86@gmail.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char letra = 'D';
        System.out.println(letra);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Donde estoy";
        System.out.println(localidad);
        localidad = "Donde no estoy";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 4;
        int b = 3;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(letra);
        System.out.println(email);

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String declarar = "";
        declarar = "Nuevo valor";
        System.out.println(declarar);
    }
}
