import java.util.Scanner;

public class Problema39 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Realizar un algoritmo que reseulva el problema de verificar si un número es positivo, negatito o neutro
        System.out.println("Ingrese una opción: \n1. Es positivo\n2. Es negativo\n3. Es neutro:");
        int opcion = leer.nextInt();
        System.out.println("Ingrese un número: ");
        int valor = leer.nextInt();
        switch (opcion){
            case 1:
                if(valor >0){
                    System.out.println("El valor es positivo.");
                }else
                    System.out.println("El valor no es positovo.");
                break;
            case 2:
                if (valor < 0 ){
                    System.out.println("El valor en negativo.");
                }else
                    System.out.println("El valor no es negativo");
                break;
            case 3:
                if (valor == 0){
                    System.out.println("El valor es neutro.");
                }else
                    System.out.println("El valor no es nutro.");
            default:
                System.out.println("Valor fuera de rango.");
        }
    }
}
