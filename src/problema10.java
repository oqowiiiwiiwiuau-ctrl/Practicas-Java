import java.util.Scanner;

public class problema10 {
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

        // Nota: la primera prueba de escritorio se detecto una inconsistencia
        // 4|2|6|8 --> en realidad el valor es 36
        // Respetando la jerarquia de operaciones
    }
}
