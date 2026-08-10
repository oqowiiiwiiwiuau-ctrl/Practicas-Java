import java.util.Scanner;

public class Problema10_propuesto6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer el sueldo de 3 empeleados y aplicarles un aumentos del 13, 16 y 15 respectivamente
        System.out.println("Ingrese primer sueldo: ");
        double x = leer.nextDouble();
        System.out.println("Ingrese el segundo sueldo: ");
        double y = leer.nextDouble();
        System.out.println("Ingrese el tercer sueldo: ");
        double z = leer.nextDouble();
        double x1 = x+(x*0.13);
        double y1 = y+(y*0.16);
        double z1 = z+(z*0.15);
        System.out.println("Los sueldo con su sumento serian: "+x1+" "+y1+" "+z1);
    }
}
