import java.util.Scanner;

public class Problema40_propuesto6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Un taxista compra gasolina 4 veces al día en gasolinera "El alteño", se le realiza un descuento
        //de la siguiente manera si la compra tota les entre 150-250 bs se le descuentael 12% si la compra
        //total supera los 250bs se le realiza un descuento de 15%
        System.out.println("Ingrese el valor de la compra: ");
        double x = leer.nextInt();
        if (x >= 150 && x <= 250){
            double descuentoUno = x-(x*0.12);
            System.out.println("El valor final menos el descuento es: "+descuentoUno);
        } else if (x > 250) {
            double descuentoDos = x-(x*0.15);
            System.out.println("El valor final menos descuento es: "+descuentoDos);
        }else
            System.out.println("No se realizo ningun descuento."+x);
    }
}
