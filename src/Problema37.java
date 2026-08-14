import java.sql.SQLOutput;
import java.util.Scanner;

public class Problema37 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar uno de los números enteros (1,2,3,4) y de acuerdo a la opción verifica si algunas
        // de las materias como matematica, fisica, quimica, y otros le interesa.
        System.out.println("Ingrese un número del 1 al 4 para ver la materia que te gusta: ");
        int x = leer.nextInt();
        switch (x){
            case 1:
                System.out.println("Matemáticas");
                break;
            case 2:
                System.out.println("Física");
                break;
            case 3:
                System.out.println("Química");
                break;
            case 4:
                System.out.println("otros");
                break;
            default:
                System.out.println("Valor fuera de rango");
        }
    }
}
