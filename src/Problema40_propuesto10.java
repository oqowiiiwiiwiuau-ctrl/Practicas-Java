import java.util.Scanner;

public class Problema40_propuesto10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se tiene una masa en kilogramos convertir la masa en gramos si la masa es menor a 2500 kg
        System.out.println("Ingrese el valor de los kilogramos: ");
        double x = leer.nextInt();
        if (x < 2500){
            double gramos = x*1000;
            System.out.println("El valor en gramos es: "+gramos);
        }else
            System.out.println("No se puede convertir esa cantidad en gramos");
    }
}
