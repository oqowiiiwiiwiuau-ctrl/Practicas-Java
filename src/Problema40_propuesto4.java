import java.util.Scanner;

public class Problema40_propuesto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Verificar si un número es par o impar
        System.out.println("Ingrese un valor para determinar si es par o impar: ");
        int x = leer.nextInt();
        if (x % 2 == 0){
            System.out.println("El valor es par.");
        }else
            System.out.println("El valor es impar.");
    }
}
