
import java.util.Scanner;

public class Division {
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Resultado de la división: " + dividir(num1, num2));
        scanner.close();
    }
}


//4. pedir 2 números y realizar la división por función. 

