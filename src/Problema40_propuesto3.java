import java.util.Scanner;

public class Problema40_propuesto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se tiene dos numeros distintos cual es el mayor
        System.out.println("Ingrese primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese segundo valor: ");
        int y = leer.nextInt();
        if (x > y ){
            System.out.println("El valor mayor es: "+x);
        }else
            System.out.println("El valor mayor es: "+y);
    }
}
