import java.util.Scanner;

public class Problema10_propuesto8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se tiene una longitud en milla terrestes converit la longitud en milimetros 1 milla=1609,344 m
        // 1 mi=1609344 mm
        System.out.println("Ingrese millas: ");
        double x = leer.nextDouble();
        double convertir = x*1609344;
        System.out.println("El valor en milimetros es: "+convertir);
    }
}
