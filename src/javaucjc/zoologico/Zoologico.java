package javaucjc.zoologico;

public class Zoologico {
	
	public static void	alimentarAnimales(Animal animales[])
	{
		for (Animal animal:animales)
			animal.comer();
	}

	public static void main(String[] args) {
		
		Elefante elefante;
		Serpiente serpiente;
		Vaca vaca;
		
		elefante = new Elefante("Pepe", "Africano", 5);
		serpiente = new Serpiente("Sepia", "Cascabel", 5);
		vaca = new Vaca("Josefa", "Normal", 2);
		for (Animal animal:new Animal[] {elefante, serpiente, vaca})
			animal.desplazar();
	}

}
