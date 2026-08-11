import java.util.Scanner;

public class Problema24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar por teclado tres números enteros (a,b,c) y encontrar el mayor de estos
        System.out.println("Ingresar el primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingresar el segundo valor: ");
        int y = leer.nextInt();
        System.out.println("Ingresar el tercer valor: ");
        int z = leer.nextInt();
        if (x > y && x > z){
            System.out.println("El valor mayor es: "+x);
        } else if (y > x && y > z) {
            System.out.println("El valor mayor es: "+y);
        } else if (z > x && z > y) {
            System.out.println("El valor mayor es: "+z);
        }
    }
}
