import cuentabancaria.CuentaBancaria;

public class principal {

	public static void main(String[] args) {
		
		/*Persona pers = new Persona("Nico","Olivera",28,"12345678","Masculino",75.5,17.3);
		System.out.println(pers.getNombre()+ " " + pers.getApellido());
		System.out.println("Es mayor de edad: "+ pers.esMayor());
		*/
		Persona p1 = new Persona();
		Persona p2 = new Persona("Nico","Olivera",28,"12345678","Masculino",75.5,17.3);
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		p1.setEdad(32);
		p1.setDni("23455123");
		p1.setSexo("Masculino");
		p1.setAltura(1.80);
		p1.setPeso(75);
		
		System.out.println("El peso de " + p1.getNombre() + " es " + p1.getPeso());
		System.out.println("El peso de " + p2.getNombre() + " es " + p2.getPeso());
		
		CuentaBancaria c1 = new CuentaBancaria("Nico", "1234564", 1000, 2500);
		System.out.println(c1.calcularComisionDeRetiro());
	}

}
