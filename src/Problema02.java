import java.util.Scanner;
import java.util.*;
import static java.lang.Math.sqrt;

public class Problema02 {
    public static void main(String[] args) {
        //Ingresar un número entero por teclado y calcular el cuadrado de este
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para hallar el cuadrado: ");
        int x = leer.nextInt();
        double z = Math.pow(x,x);
        System.out.println("El cuadrado del valor es: "+z);
    }
}
