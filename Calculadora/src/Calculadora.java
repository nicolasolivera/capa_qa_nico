import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  leer = new Scanner(System.in);
		String opcion;
		int numero1;
		int numero2;
		
		System.out.println("Elige la operación que desea realizar:");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		
		opcion = leer.next();
		System.out.println("Escribe el primer numero:");
		numero1 = leer.nextInt();
		
		System.out.println("Escribe el segundo numero:");
		numero2 = leer.nextInt();
		
		System.out.println("La opción a realizar es: " + numero1 + opcion + numero2);
		System.out.println("Resultado de la suma: " + (numero1+numero2));
		System.out.println("Resultado de la resta: " + (numero1-numero2));
		System.out.println("Resultado de la multipliación es: " + (numero1*numero2));
		System.out.println("Resultado de la división es: " + (numero1/numero2));
		
		
	}

}

