import java.util.Scanner;

public class Problema28 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //A un trabajador se le aplica un aumento del 20% en su salario si este es menor o igual a 800 bs.
        //(Tomar en cuenta que el salario minimo esta establecido por el estado y pagar un monto menor del
        //salario minimo nacional es una infracción laboral y administrativa), y 8% en caso constrario.
        System.out.println("Ingrese el salario del trabajador: ");
        double x = leer.nextDouble();
        if (x <= 800) {
            double y = x+(x*0.20);
            System.out.println("El salario es: "+y);
        } else if (x > 800) {
            double z = x+(x*0.05);
            System.out.println("El salario es: "+z);
        }
    }
}
