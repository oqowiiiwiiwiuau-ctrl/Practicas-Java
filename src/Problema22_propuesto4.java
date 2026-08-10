import java.util.Scanner;

public class Problema22_propuesto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer un día (lunes, martes, etc.) e indicar si es un día laboral o dia de descanso.
        System.out.println("Ingrese el día: ");
        String x = leer.nextLine().toLowerCase();
        switch (x){
            case "lunes":
                System.out.println("Dia laborable.");
                break;
            case "martes":
                System.out.println("Dia laborable.");
                break;
            case "miercoles":
                System.out.println("Dia laborable.");
                break;
            case "jueves":
                System.out.println("Dia laborable.");
                break;
            case "viernes":
                System.out.println("Dia laborable.");
                break;
            case "sábado":
                System.out.println("Dia de descando.");
                break;
            case "domingo":
                System.out.println("Dia de descanso.");
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
}
