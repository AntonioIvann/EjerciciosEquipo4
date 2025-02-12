//1. pedir dos números y realizar la suma por función.


import java.util.Scanner;

public class Suma {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Resultado de la suma: " + sumar(num1, num2));
        scanner.close();
    }
}
