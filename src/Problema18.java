import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar un número entero n y verificar si este es múltiplo de 3.
        System.out.println("Ingrese un valor para determinar si es multiplo de 3 : ");
        int x = leer.nextInt();
        if (x % 3 ==0){
            System.out.println("El valor es múltiplo de 3.");
        }else{
            System.out.println("El valor No es múltiplo de 3. ");
        }
    }
}
