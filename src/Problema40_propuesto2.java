import java.util.Scanner;

public class Problema40_propuesto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Hallar el valor absoluto de un número
        System.out.println("Ingrese valor para determinar su valor absoluto: ");
        int x = leer.nextInt();
        if (x > 0){
            System.out.println("El valor absoluto es: "+x);
        }else
            System.out.println("El valor absoluto es: "+(x*(-1)));
    }
}
