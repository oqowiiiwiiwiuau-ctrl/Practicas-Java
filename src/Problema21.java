import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar por teclado un número entero positivo n y verifica si este es par o impar
        System.out.println("Ingrese un valor: ");
        int x = leer.nextInt();
        if (x % 2 == 0){
            System.out.println("El valor es par.");
        }else{
            System.out.println("El valor es impar");
        }
    }
}
