import java.util.Scanner;

public class Problema10_propuesto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Calcular el área de un rectangulo a parte de su altura y su base
        System.out.println("Para determinar el área de un rectangulo se pide altura y base ");
        System.out.println("Ingrese la altura: ");
        int x = leer.nextInt();
        System.out.println("Ingrese la base: ");
        int y = leer.nextInt();
        System.out.println("El área del rectangulo es: "+x*y);
    }
}
