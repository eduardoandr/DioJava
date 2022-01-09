package programaJava;

import java.util.Scanner;

import programaJava.calculadora.Calculadora;
import programaJava.model.Mecanica;

public class ProgramaJava {

	//Classe principal, que faz todos os métodos e classes alinharem e resultarem na solução dos
	//respectivos problemas.
	public static void main(String[] args) {
		
		//Váriaveis instanciadas
		int a, b;
		double c, d;
		
		//Responsavel por receber dados vindos do usuário
		Scanner leia = new Scanner(System.in);
		
		
		//Inicio da função dos métodos para cálculos
		//Soma
		/*System.out.println("Digite o primeiro valor : ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor : ");
		b = leia.nextInt();
		Calculadora.soma(a, b);
		
		//Subtração
		System.out.println("Digite o primeiro valor : ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor : ");
		b = leia.nextInt();
		Calculadora.subtracao(a, b);
		
		//Multiplicação
		System.out.println("Digite o primeiro valor : ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor : ");
		b = leia.nextInt();
		Calculadora.multiplicacao(a, b);
		
		//Divisao
		System.out.println("Digite o primeiro valor : ");
		c = leia.nextInt();
		System.out.println("Digite o segundo valor : ");
		d = leia.nextInt();
		Calculadora.divisao(c, d);*/
		
		//Fim da Calculadora
		
		Mecanica cliente = new Mecanica();
		
		cliente.setEmail("prosival@email.com");
		cliente.setNomeCliente("Prosival José");
		cliente.setModelo("HB20");
		cliente.setKm(30.000);
		cliente.setPlaca("kkk-7777");
		
		System.out.println("O email do cliente é: " + cliente.getEmail());
		System.out.println("O nome do cliente é: " + cliente.getNomeCliente());
		System.out.println("O carro do cliente é: " + cliente.getModelo());
		System.out.println("O km do carro do cliente é: " + cliente.getKm());
		System.out.println("A placa do veiculo do cliente é: " + cliente.getPlaca());
		
			
				
	}
		// visibilidade/tipo/classe/objeto
	
		//private static void Mecanica Mecanica() {
		
	}

	


