package programaJava.calculadora;

import java.util.Scanner;

public class Calculadora {

	
	//Classe respons�vel por apresentar as devidas tratativas e opera��es aritm�ticas
	//para entao ser chamado, rodar na classe main(Principal) ou seja "testa todos"!
	public static void soma(int a, int b) {
		int resultado = a + b;
		System.out.println("A soma de " + a + " + " + b +
				" � igual: " + resultado);
	}
	public static void subtracao(int a, int b) {
		int resultado = a - b;
		System.out.println("A subtra��o de " + a + " - " + b +
				" � igual: " + resultado);
	}
	public static void multiplicacao(int a, int b) {
		int resultado = a * b;
		System.out.println("A multiplica��o de " + a + " x " + b +
				" � igual: " + resultado);
	}
	public static void divisao(double c, double d) {
		double resultado = c / d;
		System.out.println("A divis�o de " + c + " / " + d +
				" � igual: " + resultado);
	}
}