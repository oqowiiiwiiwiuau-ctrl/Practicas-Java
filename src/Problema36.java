import java.util.Scanner;

public class Problema36 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar los núemros enteros (1,2,3,4,5) y devolver el número en números romanos
        System.out.println("Ingrese el valor que quiere convertir a números romanos: ");
        int x = leer.nextInt();
        switch (x){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            default:
                System.out.println("Valor fuera de rango.");
        }
    }
}
