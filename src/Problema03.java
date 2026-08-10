import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args) {
        //Ingresar un número entero por teclado y calcular el negativo de este
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para determinar su negativo: ");
        int x = leer.nextInt();
        int z = x*(-1);
        System.out.println("El valor negativo es: "+z);
    }
}
