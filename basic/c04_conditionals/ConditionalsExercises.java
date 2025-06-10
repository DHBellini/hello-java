package basic.c04_conditionals;

/*
Clase 3 - Strings, Condicionales y Arrays (17/04/2025)
Vídeo: https://www.twitch.tv/videos/2436086584
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 19;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 9;
        int b = 8;

        if (a > b){
            System.out.println(a + " es mayor a " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor a " + a);
        }else{
            System.out.println("Son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int c = 5;

        if (c > 0){
            System.out.println("Es positivo");
        } else if (c < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int d = 7;

        if (d % 2 == 0) {
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int e = 50;

        if(e >= 1 && e <= 100){
            System.out.println("Esta en el rango");
        }else{
            System.out.println("No esta en el rango");
        }


        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var DiaDeLaSemana = 2;

        switch (DiaDeLaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero ingresado incorrecto");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 85;

        if(nota < 0 || nota > 100){
            System.out.println("Numero fuera del rango establecido");
        }else{
            if(nota >= 90){
                System.out.println("Sobresaliente");
            } else if (nota >= 70) {
                System.out.println("Aprobado");
            }else{
                System.out.println("Suspenso");
            }
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int años = 16;
        boolean acampoñado = false;

        if (años >= 15 || acampoñado){
            System.out.println("Puede ingresar");
        }else {
            System.out.println("No puede ingresar");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'u';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
            System.out.println("Es Vocal");
        }else {
            System.out.println("Es consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int aa = 8;
        int bb = 11;
        int cc = 15;

        if ( aa > bb && aa > cc){
            System.out.println("aa es la mayor");
        } else if (bb > cc && bb > aa) {
            System.out.println("bb es el mayor");
        }else if (cc > aa && cc > bb) {
            System.out.println("cc es el mayor");
        }else{
            System.out.println("error");
        }

    }
}
