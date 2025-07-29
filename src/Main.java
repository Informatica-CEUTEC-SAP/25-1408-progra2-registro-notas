import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Registrar Notas de uno o varios alumnos
        // Cuantos estudiantes?
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        //Arreglos multidimensionales para nombres y notas
        String[] nombres = new String[numAlumnos];
        double[] notas = new double[numAlumnos];
        double sumaNotas = 0;
        //INPUT
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            double nota;
            boolean esNotaIncorrecta;
            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (entre 0 y 100): ");
                nota = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner

                esNotaIncorrecta = nota < 0 || nota > 100; // true o false
                if (esNotaIncorrecta) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                    continue;  //break and continue the loop
                }
                notas[i] = nota;
                sumaNotas += nota;
            } while (esNotaIncorrecta);
        }
        //PROCESO
        //Calcular promedio
        double promedio = sumaNotas / numAlumnos;
        System.out.println("El promedio de las notas es: " + promedio);
        //Mostrar alumnos aprobados y reprobados
        System.out.println("Alumnos aprobados:");

        //OUTPUT
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] >= 60) {
                System.out.println(nombres[i] + " con nota: " + notas[i]);
            }
        }
    }
}