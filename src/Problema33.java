import java.util.Scanner;

public class Problema33 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar un número entero desde (0 al 3) y devolver el número en letras
        System.out.println("Ingrese el valor númerico que quieres transformar en letras: ");
        System.out.println("El rango esta limitado de 0 al 3: ");
        int x = leer.nextInt();
        switch (x){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("El valor esta fuera de la opción.");
        }
    }
}
