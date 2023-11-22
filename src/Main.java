import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        System.out.println("Mi calculadora!!");

        System.out.println("¿Cuál es tu nombre?");
        String nombre = input.next();

        System.out.println(STR."Bienvenido \{nombre}");

        System.out.println("Escribe los números que deseas calcular");
        try {
            calcular(input, nombre);
        } catch (Exception e) {
            System.out.println("Los datos deben ser un número");
        }

        input.close();
    }

    public static Boolean comprobarDivisor(double divisor){
        if (divisor == 0) {
            System.out.println("No se puede dividir por 0(cero)");
            return false;
        } else {
            return true;
        }
    }
    public static void calcular(Scanner input, String nombre) {
        System.out.println("Escribe primer número");
        double num1 = input.nextDouble();

        System.out.println("Escribe el segundo número");
        double num2 = input.nextDouble();

        System.out.println("Que operación quieres hacer?");

        String menu = STR."""
                Tu calculadora \{nombre}
                1- Suma
                2- Resta
                3- Multiplicación
                4- Division
                5- Raiz cuadrada
                """;

        System.out.println(menu);
        int num3 = input.nextInt();

        if (num3 == 1){
            System.out.println("La suma es: " + Math.round(num1 + num2));
        } else if (num3 == 2) {
            System.out.println("La resta es: " + (num1 - num2));
        } else if (num3 == 3) {
            System.out.println("La multiplicación es: " + (num1 * num2));
        } else if (num3 == 4) {
            if (comprobarDivisor(num2)) {
                System.out.println("La división es : " + (Math.round(num1 * 100d / num2)) / 100d);
            }
        } else if (num3 == 5) {
            System.out.println("La raiz cuadrada es : " + (Math.sqrt(num1)));
        } else {
            System.out.println("Operación no válida");
        }
    }

}