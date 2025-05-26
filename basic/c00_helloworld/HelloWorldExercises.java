package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Dario");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola \nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // public class define una clase accesible desde cualquier lugar del programa
        // public static void main(String[] args)  define el metodo principal desde el cual se ejecuta el codigo

        // 4. Crea un comentario en varias líneas.
        /*
        estas
        son
        varias
        lineas
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("38, azul, Bs As");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("error");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Esto ");
        System.out.println("es ");
        System.out.println("una ");
        System.out.println("frase");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("☺");
        System.out.println("♫");
        System.out.println("§");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // anula la hoja.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // No funciona, porque tienen numbres distintos.

    }
}