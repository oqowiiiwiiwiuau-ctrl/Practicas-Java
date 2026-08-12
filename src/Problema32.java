import java.util.Scanner;

public class Problema32 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Al ingresar los caracteres F y M devolver el género masculino, femenino
        System.out.println("Ingrese el caracter de genero: ");
        String genero = leer.nextLine().toLowerCase();
        switch (genero){
            case "f":
                System.out.println("Femenino.");
                break;
            case "m":
                System.out.println("Masculino.");
                break;
            default:
                System.out.println("Caracter fuera de opción.");
        }
    }
}
