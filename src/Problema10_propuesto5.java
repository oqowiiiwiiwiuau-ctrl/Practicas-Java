import java.util.Scanner;

public class Problema10_propuesto5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //El algoritomo que pide el precio de un articulo y calcular su valor aplicandolo un 13% de iva
        //Si tenemos un precio unitario como 100 el valor el iva seria sumar el 14.94 al valor
        //Para que al sacar el 0.87% nos de nuestro precio unitario que es bs. 100
        System.out.println("Determinación de precio de venta de un producto agregando IVA: ");
        System.out.println("Agregar precio unitario del producto: ");
        double unitario = leer.nextDouble();
        double precio_mas_iva = unitario+(unitario*0.1494);
        System.out.println("El precio de venta es: "+precio_mas_iva);
    }
}
