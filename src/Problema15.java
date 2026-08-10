import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar el sueldo de una persona, si supera los 5000 bs. mostrar un mensaje en pantalla
        //indicando que debe pagar impuestos
        System.out.println("Ingrese su sueldo: ");
        int x = leer.nextInt();
        if (x >= 5000){
            System.out.println("Sueldo mayor a 5000 bs. debes pagar impuestos.");
        }else{
            System.out.println("No debes pagar impuestos adicionales. ");
        }
    }
}
