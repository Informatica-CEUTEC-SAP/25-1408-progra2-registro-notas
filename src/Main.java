import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Registrar Notas de uno o varios alumnos
        // Cuantos estudiantes?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea
        //Arreglos multidimensionales para nombres y notas
        String[] nombres = new String[numAlumnos];
        double[] notas = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            double nota;
            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (entre 0 y 100): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 100) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                }
                notas[i] = nota;
            } while (nota < 0 || nota > 100);
        }

        //Calcular promedio
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }

        double promedio = sumaNotas / numAlumnos;
        System.out.println("El promedio de las notas es: " + promedio);
        //Mostrar alumnos aprobados y reprobados
        System.out.println("Alumnos aprobados:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] >= 60) {
                System.out.println(nombres[i] + " con nota: " + notas[i]);
            }
        }
    }
}