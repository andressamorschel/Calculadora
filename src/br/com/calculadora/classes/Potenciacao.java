package br.com.calculadora.classes;

public class Potenciacao extends Calculo {

	public Potenciacao(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public Boolean validar() {
		return num1 >= 0 && num2 >=0;
	}

	@Override
	protected int doCalcular() {
		return (int)Math.pow(num1, num2);
	}

}
