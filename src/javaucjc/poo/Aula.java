package javaucjc.poo;

public class Aula {

	public static void main(String[] args) {
		
		Alumno	alumno = new Alumno("David", "Gómez Bruno", new
				Asignatura("Programación"));
		alumno.getAsignatura().setNotaMedia(5);
		Alumno	alumno2 = new Alumno("Maroto", "el de la Moto");
		alumno.estudiar();
		alumno2.setAsignatura(new Asignatura("Programación", 5));
		alumno2.estudiar();
		
	}

}
