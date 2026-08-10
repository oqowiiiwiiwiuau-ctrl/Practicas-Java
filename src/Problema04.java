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
        // Nota: Se detectó una discrepancia en la segunda prueba de escritorio del material,primera edición
        // Para la entrada 13 y 2, el cociente correcto es 6 y el residuo es 1.
        // Por lo tanto: 13 / 2 = 6 y 13 % 2 = 1.
        // En la segunda prueba
        // 13|2|5|3   -->  13|2|6|1
    }
}
