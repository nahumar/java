package punto2;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio2 implements IEjercicio{

    public void ejecutar()
    {
        Scanner sc = new Scanner(System.in);

        Infanteria infanteria = new Infanteria();

        // CARGA DE DATOS
        while(true)
        {
            System.out.println("Ingrese la especialidad (0 para Terminar): ");
            String especialidad = sc.nextLine();

            if ( especialidad == "0" ) break;

            Curso curso = new Curso(especialidad);

            while ( true )
            {
                System.out.println("Ingrese el/la recluta(1 = Mujer | 2 = Hombre | 0 = Terminar): ");
                int generoDelRecluta = sc.nextInt();

                if (generoDelRecluta == 0) break;

                curso.addRecluta(new Recluta(generoDelRecluta));
            }

            infanteria.addCurso(curso);

        }
        
        // CALCULO 
        
        int total = infanteria.getCant_infantes();
        int mujeres = infanteria.getCant_mujeres();
        int hombres = infanteria.getCant_hombres();
        
        // MUESTRA DE DATOS
        System.out.println("Cantidad de infantes inscriptos en total: "+ total);
        System.out.println("Cantidad de infantes mujeres inscriptos : "+ mujeres);
        System.out.println("Cantidad de infantes hombres inscriptos: "+ hombres);
        
        // generos por cada cursos
        for (Curso curso: infanteria.getCursos()) {
            System.out.println("Cantidad de mujeres incriptas en "+ curso.especialidad +" : "+ curso.getCantidadInscriptosMujeres());
            System.out.println("Cantidad de hombres incriptos en "+ curso.especialidad +" : "+ curso.getCantidadInscriptosHombres());
        }

        sc.close();
    }
}