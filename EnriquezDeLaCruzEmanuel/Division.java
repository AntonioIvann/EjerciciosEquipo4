import java.util.Scanner;//Tipo de libreria

class Division {// Nombre de la clase
    public static void main(String[] args) {// Metodo main
        Scanner op = new Scanner(System.in);// Objeto Scanner
        System.out.println("Dame un numero");// Pide al usuario un dato
        double a = op.nextDouble();// Guarda el dato en la variable a
        System.out.println("Dame otro numero");// Pide al usuario otro dato
        double b = op.nextDouble();// Guarda el dato en la variable b
        division(a, b);// Manda a llamar a la funcion
    }

    public static void division(double a, double b) {// Hace la funcion
        // Hacemos una validacion que verifique se el dato se puede dividir o no
        // Si es el dato es 0 mandara que no se puede dividir
        if (b != 0) {
            System.out.println("La divicion es: " + (a / b));
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }
}