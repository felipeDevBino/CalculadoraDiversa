package controller.rapida;

import java.util.Scanner;

import view.rapida.CalcRapidaView;

public class EntradaDados {

	public int insercaoDeNumero(Scanner scanner) {
		return Integer.parseInt(scanner.nextLine());
	}

	public String operacao(Scanner scanner, CalcRapidaView view) {
		view.imprimeMensagem(
				"(+) soma (-) subtração (*) multiplicação (/) divisão (0) cancelar (c) limpar (h) histórico\n:");
		return scanner.nextLine();
	}

}
