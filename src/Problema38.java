import java.util.Scanner;

public class Problema38 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Dados dos números realizar las siguientes operaciones según una opción
        //1 mostrar el mayor
        //2 mostrar el menor
        //3 son iguales
        System.out.println("Ingresar un valor: ");
        int x = leer.nextInt();
        System.out.println("Ingresar segundo valor: ");
        int y = leer.nextInt();
        System.out.println("Escoja la operaciones que desea realizar " +
                "\n 1: Mostrar el mayor \n 2: Mostrar el menor \n 3:son iguales? ");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                if ( x > y ){
                    System.out.println("El valor mayor es: "+x);
                }else{
                    System.out.println("El valor mayor es: "+y);
                }
                break;
            case 2:
                if( x < y ){
                    System.out.println("El valor menor es: "+y);
                }else{
                    System.out.println("El valor menor es: "+x);
                }
                break;
            case 3:
                if( x == y ){
                    System.out.println("Los valores son iguales.");
                }else{
                    System.out.println("Los valores no son iguales.");
                }
                break;
            default:
                System.out.println("Valor fuera de rango.");
        }
    }
}
