import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Introducir un número entero desde el teclado del 1 al 7 y devuelva el día de la semana
        System.out.println("Ingrese un valor: ");
        int x = leer.nextInt();
        switch (x){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opción invalida. ");
                break;
        }
    }
}
