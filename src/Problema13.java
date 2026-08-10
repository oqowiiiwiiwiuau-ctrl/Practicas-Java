import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar un número positivo n y verifique si es número par
        System.out.println("Ingrese el numero: ");
        int x = leer.nextInt();
        if (x % 2 == 0 ){
            System.out.println("El número es par ");
        }else{
            System.out.println("El numero es impar ");
        }
    }
}
