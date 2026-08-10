import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Verifica si el número entero introducido por teclado es positivo
        System.out.println("Ingrese un número: ");
        int x = leer.nextInt();
        if (x > 0){
            System.out.println("El número es positivo.");
        }else{
            System.out.println("El numero es negativo.");
        }
    }
}
