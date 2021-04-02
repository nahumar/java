package punto9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Principal.IEjercicio;

public class Ejercicio9 implements IEjercicio{

    public void ejecutar() {

        Scanner sc = new Scanner(System.in);
        int cant = 2;

        List<Estudiante9> estudiantes = new ArrayList<Estudiante9>();

        for ( int i = 0 ; i < cant ; i++ )
        {
            Estudiante9 estudiante = new Estudiante9();

            System.out.println("Nombre: ");
            estudiante.setNombre(sc.next());

            System.out.println("Edad: ");
            estudiante.setEdad(sc.nextInt());

            System.out.println("CURSOS: ");
            for ( int j = 1 ; j <= 6 ; j++ )
            {
                Curso curso = new Curso();
                System.out.println("Curso "+ j +": ");

                System.out.println("Nombre: ");
                curso.setNombre(sc.next());

                System.out.println("Nota: ");
                curso.setNota(sc.nextInt());

                estudiante.agregarCurso(curso);
            }

            estudiantes.add(estudiante);
        }

        // fin de semestre
        for (Estudiante9 estudiante : estudiantes) {
            estudiante.mostrarPorPantalla();
        }

        sc.close();
    }

}
