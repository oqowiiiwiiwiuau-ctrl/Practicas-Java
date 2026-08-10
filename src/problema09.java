import java.util.Scanner;

public class problema09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //caclular la siguiente expresión: x+10y+2z
        System.out.println("Ingrese el valor de x: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el valor de y: ");
        int y = leer.nextInt();
        System.out.println("Ingrese el valor de z: ");
        int z = leer.nextInt();
        int valor = x+10*y+2*z;
        System.out.println("El resultado de la expresión es: "+valor);
    }
}
