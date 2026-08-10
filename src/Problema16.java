import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar el costo de un producto por teclado, si el costo es inferior a 1000 bs. incrementar un 10%
        //al costo y mostrar el nuevo costo con el incremento.
        System.out.println("Ingrese el costo del producto: ");
        int x = leer.nextInt();
        //Declaramos una variable para el incremento
        double valorFinal = 0;
        if (x > 1000){
            System.out.println("El costo final es: "+x);
        } else if (x <= 1000) {
            valorFinal = x+(x*0.10);
            System.out.println("El costo final es: "+valorFinal);
        }
    }
}
