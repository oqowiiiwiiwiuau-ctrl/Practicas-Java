import java.util.Scanner;

public class Problema40_propuesto7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Encontrar el mayour de 3 números distintos
        System.out.println("Para determinar el valor mayor entre 3 valor, ingrese primer valor: ");
        double x = leer.nextInt();
        System.out.println("Ingrese segundo valor: ");
        double y = leer.nextInt();
        System.out.println("Ingrese tercer valor: ");
        double z = leer.nextInt();
        if (x > y && x > z){
            System.out.println("El valor mayor es: "+x);
        } else if (y > x && y > z) {
            System.out.println("El valor mayor es: "+y);
        } else if (z > x && z > y) {
            System.out.println("El valor mayor es: "+z);
        }
    }
}
