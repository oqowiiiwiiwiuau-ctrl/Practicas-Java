import java.util.Scanner;

public class Problema27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Determinar el valor absoluto de un número entero
        System.out.println("Ingrese un valor para determinar su valor absoluto: ");
        int x = leer.nextInt();
        if (x > 0 ){
            System.out.println("El valor absoluto es: "+x);
        } else if (x < 0) {
            System.out.println("El valor absoluto es: "+(x*-1));
        }else {
            System.out.println("El valor es cero.");
        }
    }
}
