package br.com.calculadora.fabricas;

import br.com.calculadora.classes.Adicao;
import br.com.calculadora.classes.Divisao;
import br.com.calculadora.classes.Multiplicacao;
import br.com.calculadora.classes.Potenciacao;
import br.com.calculadora.classes.Subtracao;
import br.com.calculadora.interfaces.Calculador;

public class FabricaDeCalculos {

	public Calculador criarCalculador(int num1, int num2, String calculo) {
		if (calculo.equals("+")) {
			return new Adicao(num1, num2);
		} else if (calculo.equals("-")) {
			return new Subtracao(num1, num2);
		} else if(calculo.equals("*")){
			return new Multiplicacao (num1, num2);
		} else if(calculo.equals("/")) {
			return new Divisao(num1, num2);
		} else if (calculo.equals("^")) {
			return new Potenciacao(num1, num2);
		} else {
			return null;
		}
  
	}

}
