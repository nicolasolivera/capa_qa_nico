package herencia;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado empleado = new Empleado("Nico", "Olivera", "M", 36, "12345678", "102", "2015", 50000, "78", "Sistemas");
		
		System.out.println("El nombre del empleado es: " + empleado.getNombre() + " " + empleado.getApellido());
		System.out.println("La antiguedad del empleado es: " + empleado.antiguedad());
		System.out.println("El salario actual del empleado es: " + empleado.aumento());
		
	}

}
