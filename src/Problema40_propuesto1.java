import java.util.Scanner;

public class Problema40_propuesto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Realizar la compra de un producto, si el costo del producto es 300 bs.
        System.out.println("La compra solo se realizara si supera los 300 Bs. ");
        System.out.println("Ingrese el valor del producto: ");
        int x = leer.nextInt();
        if( x >= 300 ){
            System.out.println("La compra procede");
        }else
            System.out.println("El valor es menor a 300 no se realiza.");
    }
}
