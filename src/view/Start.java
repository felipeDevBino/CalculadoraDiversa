package view;

import java.util.Scanner;

import model.rapido.LogicaDeDados;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LogicaDeDados executar = new LogicaDeDados();
		executar.logicaDeExecucao(scanner);
		scanner.close();
	}

}
