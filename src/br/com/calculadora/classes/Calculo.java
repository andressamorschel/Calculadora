package br.com.calculadora.classes;

import br.com.calculadora.interfaces.Calculador;

public abstract class Calculo implements Calculador {

	protected int num1;
	protected int num2;
	
	public Calculo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public Boolean validar() {
		return num1 >= 0 && num2 >=0;
	}
	@Override
	public int calcular() {
		if (validar()) {
			return doCalcular();
		}
		else {
			return -1;
		}
	
}
	protected  abstract  int doCalcular();

	}








