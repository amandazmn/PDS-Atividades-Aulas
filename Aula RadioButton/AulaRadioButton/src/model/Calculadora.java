package model;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	
	public Calculadora(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int getNumero1() {
		return numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public int somar(Calculadora c) {
		int resultado = c.getNumero1() + c.getNumero2();
		return resultado;
	}
	
	public int subtrair(Calculadora c) {
		int resultado = c.getNumero1() - c.getNumero2();
		return resultado;
	}
	
	public int multiplicar(Calculadora c) {
		int resultado = c.getNumero1() * c.getNumero2();
		return resultado;
	}
	
	public float dividir(Calculadora c) {
		float resultado = Float.valueOf(numero1) / Float.valueOf(numero2); 
		return resultado;
	}

}
