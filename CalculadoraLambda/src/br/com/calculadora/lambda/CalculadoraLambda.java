package br.com.calculadora.lambda;

public class CalculadoraLambda {

	interface Operacao {
		public int calcular(int a, int b);
	}

	public static void main(String[] args) {

		Operacao soma = (a, b) -> (a + b);
		
		Operacao subtracao = (a, b) -> (a - b);
		
		Operacao divisao = (a,b) -> (a/b);
		
		Operacao retornarMaior = (a,b) -> {
			if(a>b) {
				return a;
			}else {
				return b;
			}
		};

		System.out.println(soma.calcular(1, 1));
		
		System.out.println(subtracao.calcular(5, 4));
		
		System.out.println(divisao.calcular(10, 5));
		
		System.out.println(retornarMaior.calcular(-23, 44));

	}

}