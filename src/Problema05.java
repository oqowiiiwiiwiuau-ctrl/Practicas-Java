
import java.util.Scanner;

public class Problema05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingrese dos números enteros A y B pro teclado e intercambia el valor de estos;
        System.out.println("Ingrese el valor  A: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor B: ");
        int b = leer.nextInt();
        int z = a;
        a = b;
        b = z;
        System.out.println("El valor de A es: "+a+" El valor de B es: "+b);
    }
}
