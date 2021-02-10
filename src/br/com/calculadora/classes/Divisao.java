package br.com.calculadora.classes;

public class Divisao extends Calculo{

	public Divisao(int num1, int num2) {
		super(num1, num2);

	}

	@Override
	public Boolean validar() {
		return num1 >= 0 && num2 >=0;
	}
	
	@Override
	protected int doCalcular() {
		return num1 / num2;
	}

} 