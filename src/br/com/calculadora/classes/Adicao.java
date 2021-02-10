package br.com.calculadora.classes;

public class Adicao extends Calculo {

	public Adicao(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	protected int doCalcular() {
		return num1 + num2;
	}

}
