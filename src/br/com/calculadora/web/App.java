package br.com.calculadora.web;

import br.com.calculadora.fabricas.FabricaDeCalculos;
import br.com.calculadora.interfaces.Calculador;

public class App {

	public static void main(String[] args) {
		String calculo = "+";
		int num1 = 2;
		int num2 = 2;
		
		FabricaDeCalculos fabrica = new FabricaDeCalculos();
		Calculador calcular1 = fabrica.criarCalculador(num1, num2, calculo);
		if(calcular1 != null) {
			System.out.println(calcular1.calcular());
		}else {
			System.out.println("Calculo inválido");
		}
		
	}

} 
