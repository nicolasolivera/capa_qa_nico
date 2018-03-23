package cuentabancaria;

public class CuentaBancaria {
	
	private final double COMISION = 1.2;
	private final double COMISION_SNEGATIVO = 5;
	private String titular;
	private String dni;
	private double saldo;
	private double monto;
	
	public CuentaBancaria(String titular, String dni) {
			this.titular = titular;
			this.dni = dni;
						
	}
	
	public CuentaBancaria(String titular, String dni, double saldo, double monto) {
		this.titular = titular;
		this.dni = dni;
		this.saldo = saldo;
		this.monto = monto;
	}
	
	
	public double calcularComisionDeRetiro(){ 
		int retiro = 0; 
		double comision = 0; 
		retiro = (int) (this.monto/1000); 
		if (retiro > 0){ 
			comision = retiro * COMISION; 
		} 
		return comision; }
	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	
	
	
}
