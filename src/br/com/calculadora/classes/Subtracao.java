package br.com.calculadora.classes;

public class Subtracao extends Calculo{

	public Subtracao(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	protected int doCalcular() {
		return num1 - num2;
	}

}
