import java.util.Scanner;

public class Multiplicacion {
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
        scanner.close();
    }
}
//3. pedir 2 números y realizar la multiplicación por función.
