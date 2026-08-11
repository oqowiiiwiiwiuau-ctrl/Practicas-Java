import java.util.Scanner;

public class Problema30 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se pide leer tres notas de un estudiante. calcular su promedio de notas y
        //determinar si el estudiante aprobó o reprobó la materia.
        System.out.println("Ingresar nota matemáticas: ");
        int x = leer.nextInt();
        System.out.println("Ingresar nota fisica: ");
        int y = leer.nextInt();
        System.out.println("Ingresar nota química: ");
        int z = leer.nextInt();
        int promedio = (x + y + z)/3;
        System.out.println("El promedio de las notas es: "+promedio);
        if (promedio >= 51 ){
            System.out.println("Aprobo.");
        } else {
            System.out.println("Reprobo.");
        }
    }
}
