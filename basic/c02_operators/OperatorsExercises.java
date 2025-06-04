package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 2;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int c = 5;
        int d = 7;

        System.out.println(c*3);
        System.out.println(d / 7);


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a < c);
        System.out.println(d > b);
        System.out.println(c != d);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a > d);
        System.out.println(b == c);
        System.out.println(d < b);

        // 5. Utiliza el operador lógico and.
        System.out.println(a < d && b < d);

        // 6. Utiliza el operador lógico or.
        System.out.println(b > a || c > a);

        // 7. Combina ambos operadores lógicos.
        System.out.println(d > a && c < b || a != b);

        // 8. Añade alguna negación.
        System.out.println(!(d != a));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(b++);
        System.out.println(b);
        System.out.println(c--);
        System.out.println(c);
        System.out.println(++d);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(a + b > c && d - a < c);
    }
}
