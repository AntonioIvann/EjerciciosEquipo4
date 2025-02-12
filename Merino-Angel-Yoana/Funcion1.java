import java.util.Scanner;

public class Modulo {
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
            return 0;
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número (divisor): ");
        int num2 = scanner.nextInt();
        System.out.println("Resultado del módulo: " + modulo(num1, num2));
        scanner.close();
    }
}
 

//4. pedir 2 números y realizar la división por función. 


