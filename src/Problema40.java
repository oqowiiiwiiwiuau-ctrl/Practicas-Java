import java.util.Scanner;

public class Problema40 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar uno de los números enteros 1,2,3,4 y de acuerdo a la opción verificar si una persona es
        //soltera, casada, divorciada o viudo
        System.out.println("Ingrese la opción de su estado civil: \n1. Solter@\n2. Casad@\n3. Divorciad@" +
                "\n4. Viud@");
        int x = leer.nextInt();
        switch (x){
            case 1:
                System.out.println("Solter@");
                break;
            case 2:
                System.out.println("Casad@");
                break;
            case 3:
                System.out.println("Divorciad@");
                break;
            case 4:
                System.out.println("Viud@");
                break;
            default:
                System.out.println("valor fuera de rango.");
        }

    }
}
