import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar dos números naturales y detemrinar el mayor de estos.
        System.out.println("Ingrese el primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int y = leer.nextInt();
        if (x>y){
            System.out.println("El valor mayor es: "+x);
        }else if(x==y){
            System.out.println("Los valores son iguales");
        }else{
            System.out.println("El valor mayor es: "+y);
        }
    }
}
