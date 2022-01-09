package programaJava.calculadora;

import java.util.Scanner;

public class Calculadora {

	
	//Classe responsável por apresentar as devidas tratativas e operações aritméticas
	//para entao ser chamado, rodar na classe main(Principal) ou seja "testa todos"!
	public static void soma(int a, int b) {
		int resultado = a + b;
		System.out.println("A soma de " + a + " + " + b +
				" é igual: " + resultado);
	}
	public static void subtracao(int a, int b) {
		int resultado = a - b;
		System.out.println("A subtração de " + a + " - " + b +
				" é igual: " + resultado);
	}
	public static void multiplicacao(int a, int b) {
		int resultado = a * b;
		System.out.println("A multiplicação de " + a + " x " + b +
				" é igual: " + resultado);
	}
	public static void divisao(double c, double d) {
		double resultado = c / d;
		System.out.println("A divisão de " + c + " / " + d +
				" é igual: " + resultado);
	}
}