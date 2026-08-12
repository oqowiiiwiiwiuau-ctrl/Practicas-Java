import java.util.Scanner;

public class Problema34 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar los números enteros (1,2,3) y de acuerdo a la opción verificcar si el estudiante
        //aprobó, reprobó o abandono la materia.
        System.out.println("Ingrese la opción: ");
        int x = leer.nextInt();
        switch (x){
            case 1:
                System.out.println("Aprobó");
                break;
            case 2:
                System.out.println("Reprobó");
                break;
            case 3:
                System.out.println("Abandono la materia");
                break;
            default:
                System.out.println("Valor fuera de las opciones");
        }
    }
}
