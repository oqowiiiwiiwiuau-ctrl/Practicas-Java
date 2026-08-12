import java.util.Scanner;

public class Problema35 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar los caracteres (p,m,r,b,e) y de acuerdo a la opción verificar si el sueldo
        //de un trabajador es: Pésimo, Malo, Regular, Bueno o Excelente.
        System.out.println("Ingrese el caracter asignado a su sueldo: \n" +
                "P, M, R, B, E");
        String caracter = leer.nextLine().toLowerCase();
        switch (caracter){
            case "p":
                System.out.println("Pésimo");
                break;
            case "m":
                System.out.println("Malo");
                break;
            case "r":
                System.out.println("Regular");
                break;
            case "b":
                System.out.println("Bueno");
                break;
            case "e":
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Valor fuera de rango.");
        }
    }
}
