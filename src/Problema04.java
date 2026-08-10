import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresasr dos números enteros positivos pro teclado y calcular el cociente y el residuo
        System.out.println("Ingrese el numerador: ");
        double x = leer.nextDouble();
        System.out.println("Ingrese el denominador: ");
        double y = leer.nextDouble();
        int z = (int) x / (int) y;
        double residuo = x % y;
        System.out.println("El cociente es: "+z);
        System.out.println("El residuo es: "+residuo);

    }
}
