package br.com.calculadora.classes;

public class Multiplicacao extends Calculo {

	public Multiplicacao(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	protected int doCalcular() {
		return num1 * num2;
	}

}
