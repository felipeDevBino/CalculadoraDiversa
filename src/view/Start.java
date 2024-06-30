package view;

import java.util.Scanner;

import model.rapido.ExecutarRapido;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExecutarRapido executar = new ExecutarRapido();
		executar.logicaDeExecucao(scanner);
		scanner.close();
	}

}
