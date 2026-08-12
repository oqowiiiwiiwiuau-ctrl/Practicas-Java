import java.util.Scanner;

public class Problema31 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Realizr un algoritmo que resuelva el siguiente problema:
        //Dados dos números realizar las siguientes operaciones según una opción
        /*S: suma R: resta P: producto D: división */
        System.out.println("Ingrese que operación desea realizar: \n" +
                "S: suma\n" +
                "R: resta\n" +
                "P:producto\n" +
                "D: división\n");
        String operacion = leer.nextLine().toLowerCase();
        System.out.println("Ahora ingrese dos valores: \n Primer valor :");
        double x = leer.nextInt();
        System.out.println("Segundo valor: ");
        double y = leer.nextInt();
        switch (operacion){
            case "s":
                System.out.println("La sumatoria es: "+(x+y));
                break;
            case "r":
                System.out.println("La resta es: "+(x-y));
                break;
            case "p":
                System.out.println("El producto es: "+(x*y));
                break;
            case "d":
                System.out.println("La División es: "+(x/y));
                break;
            default:
                System.out.println("Valor fuera de la opción.");
        }
    }
}
