import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar por teclado una edad de una persona y verifica si esa persona es mayor de edad
        System.out.println("Ingrese la edad para verificar si la persona es mayor de edad: ");
        int x = leer.nextInt();
        if (x >=18){
            System.out.println("La persona es mayor de edad.");
        }else{
            System.out.println("La persona No es mayor de edad.");
        }
    }
}
