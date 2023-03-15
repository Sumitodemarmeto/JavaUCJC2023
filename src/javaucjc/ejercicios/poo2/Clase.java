package javaucjc.ejercicios.poo2;

import java.util.Scanner;

public class Clase {
	
	public static void main(String[] args) {
		
		Scanner			scan;
		Alumno[]		alumnos;
		Asignatura[][]	asignaturas;
		
		asignaturas = new Asignatura[2][5];
		asignaturas[0][0] = new Asignatura(1, "Redes de computadores", false, 5);
		asignaturas[0][1] = new Asignatura(2, "Matematica discreta", false, 6);
		asignaturas[0][2] = new Asignatura(3, "Tecnologia de computadores", false, 5);
		asignaturas[0][3] = new Asignatura(4, "Fundamentos fisicos de la informatica", false, 4);
		asignaturas[0][4] = null;
		asignaturas[1][0] = new Asignatura(6, "Programación", false);
		asignaturas[1][1] = new Asignatura(7, "Calculo y metodos numéricos", false);
		asignaturas[1][2] = new Asignatura(8, "Fundamentos de sistemas", false);
		asignaturas[1][3] = new Asignatura(9, "Algebra lineal", false);
		asignaturas[1][4] = new Asignatura(10, "Estructura de computadores", false);
		alumnos = new Alumno[2];
		alumnos[0] = new Alumno("David", "Gómez Bruno");
		alumnos[0].setAsignaturas(asignaturas);
		alumnos[1] = new Alumno("Pepe", "Perez", asignaturas);
		scan = new Scanner(System.in);
//		alumnos[2] = new Alumno(scan);
		
		for (Alumno i : alumnos)
		{
//			i.mostrarNotasEvaluacion(scan);
			System.out.println(i.getNotaMedia());
			System.out.println();
		}
		scan.close();
	}

}
