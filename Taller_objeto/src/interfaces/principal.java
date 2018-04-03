package interfaces;

public class principal {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Nico", 25);
		
		persona.respirar();
		persona.caminar();
		System.out.println(persona.queCome("Asado de tira"));
		System.out.println(persona.equipo());
		System.out.println("Cuantos campeonatos tiene: " + persona.campeonatos());
			
	}

}
