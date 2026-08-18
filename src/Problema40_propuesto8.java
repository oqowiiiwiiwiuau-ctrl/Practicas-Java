import java.util.Scanner;

public class Problema40_propuesto8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Calcular la soluciones reales de una ecuación de segundo grado ax^2+bx+c=0.
        //la función debe devolver el número de soluciones distintas(unasi b^2-4ac=0,
        //dos b^2-4ac>0 y ninguna si b^2-4ac<0) y aucles son esas soluciones
        System.out.println("--- RESOLUCIÓN DE ECUACIONES DE SEGUNDO GRADO (ax^2 + bx + c = 0) ---");
        System.out.print("Ingrese el valor de a: ");
        double a = leer.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = leer.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = leer.nextDouble();

        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.");
        } else {
            resolverEcuacion(a, b, c);
        }

        leer.close();
    }

    public static void resolverEcuacion(double a, double b, double c) {
        // Cálculo del discriminante
        double discriminante = (b * b) - (4 * a * c);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Discriminante (b^2 - 4ac): " + discriminante);

        if (discriminante > 0) {
            System.out.println("Número de soluciones: 2 soluciones reales distintas.");
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solución x1 = " + x1);
            System.out.println("Solución x2 = " + x2);

        } else if (discriminante == 0) {
            System.out.println("Número de soluciones: 1 solución real (raíz doble).");
            double x = -b / (2 * a);
            System.out.println("Solución x = " + x);

        } else {
            System.out.println("Número de soluciones: Ninguna solución real (soluciones complejas).");
        }
    }
}
