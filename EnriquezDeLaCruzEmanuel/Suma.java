import java.util.Scanner;//Tipo de libreria

class Suma {// Nombre de la clase
    public static void main(String[] args) {// Metodo main
        Scanner op = new Scanner(System.in);// Objeto Scanner
        System.out.println("Dame un numero");// Pide al usuario un dato
        int a = op.nextInt();// Guarda el dato en la variable a
        System.out.println("Dame otro numero");// Pide al usuario otro dato
        int b = op.nextInt();// Guarda el dato en la variable b
        System.out.println("La suma es: " + suma(a, b));// Manda a llamar a la funcion y la imprime
    }

    public static int suma(int a, int b) {// Hace la funcion
        return a + b;// Realiza la operacion
    }
}