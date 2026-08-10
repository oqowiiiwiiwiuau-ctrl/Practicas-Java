import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Realizar un algoritmo que verifique si un estudiante aprobó la materia de calculo
        System.out.println("Ingresar la nota: ");
        int x = leer.nextInt();
        if (x >= 51){
            System.out.println("Aprobo");
        }else{
            System.out.println("Reprobo");
        }
    }
}
