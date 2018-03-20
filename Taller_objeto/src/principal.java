
public class principal {

	public static void main(String[] args) {
		
		Persona pers = new Persona("Nico","Olivera",28,"12345678","Masculino",75.5,17.3);
		System.out.println(pers.getNombre()+ " " + pers.getApellido());
		System.out.println("Es mayor de edad: "+ pers.esMayor());
	}

}
