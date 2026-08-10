import java.util.Scanner;

public class Problema17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar dos números enteros por teclado y verificar si estos son iguales
        System.out.println("Ingrese el primer número: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int y = leer.nextInt();
        if (x == y){
            System.out.println("Los valores son iguales. ");
        }else{
            System.out.println("Los valores No son iguales. ");
        }
    }
}
