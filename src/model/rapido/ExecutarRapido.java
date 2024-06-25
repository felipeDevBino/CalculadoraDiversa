package model.rapido;

import java.util.Scanner;

import controller.Acesso;

public class ExecutarRapido {

	public static void logicaDeExecucao(Scanner scanner) {
		Acesso historico = new Acesso();
		String operador;
		System.out.println(":");
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2;
		do {
			System.out.println("(+) soma (-) subtração (*) multiplicação (/) divisão (0) cancelar (c) limpar (h) histórico");
			System.out.println(":");
			operador = scanner.nextLine();
			
			switch (operador) {
			case "+":
				System.out.println(num1 + " + ");
				num2 = Integer.parseInt(scanner.nextLine());
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				historico.registrarNoHistorico(num1, num2, operador);
				num1 = (num1 + num2);
				break;
			case "-":
				System.out.println(num1 + " - ");
				num2 = Integer.parseInt(scanner.nextLine());
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				historico.registrarNoHistorico(num1, num2, operador);
				num1 = (num1 - num2);
				break;
			case "*":
				System.out.println(num1 + " * ");
				num2 = Integer.parseInt(scanner.nextLine());
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				historico.registrarNoHistorico(num1, num2, operador);
				num1 = (num1*num2);
				break;
			case "/":
				System.out.println(num1 + " / ");
				num2 = Integer.parseInt(scanner.nextLine());
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				historico.registrarNoHistorico(num1, num2, operador);
				num1 = (num1/num2);
				break;
			case "0":
				System.out.println("Calculadora rápida encerrada.");
				return;
			case "c":
				System.out.println(":");
				num1 = Integer.parseInt(scanner.nextLine());
				break;
			case "h":
				historico.imprimirHistorico();
				break;
			default:
				System.out.println("Comando inválido!");
				break;
			}
		} while (!operador.equals("0"));
	}

}
