import javaucjc.ejercicios.f1.Carrera;
import javaucjc.ejercicios.f1.Coche;
import javaucjc.ejercicios.f1.Piloto;

public class Circuito {
	
	public static void main(String[] args) {

		Coche	coches[];
		Piloto	pilotos[];
		String	escuderias[];
		String	nombres[];
		Carrera	carrera;
		
		coches = new Coche[3];
		pilotos = new Piloto[3];
		escuderias = new String[] {"BMW", "Ford", "Ferrari"};
		nombres = new String[] {"Pepito", "Manolito", "Roberto"};
		for (int i = 0; i < 3; i++)
			pilotos[i] = new Piloto(nombres[i], escuderias[i]);
		for (int i = 0; i < 3; i++)
			coches[i] = new Coche(escuderias[i], escuderias[i], i+1, pilotos[i]);
		carrera = new Carrera("Prueba", "Prueba", coches, 300);
		System.out.println(carrera.iniciarCarrera(coches).getPiloto().getNombre());
		
	}
	
}
