package rapida.acesso;

import java.util.Scanner;

import start.Mensagens;

public class EntradaDados {

	public int insercaoDeNumero(Scanner scanner) {
		return Integer.parseInt(scanner.nextLine());
	}

	public String operacao(Scanner scanner, Mensagens mensagem) {
		System.out.println(
				"(+) soma (-) subtração (*) multiplicação (/) divisão (0) cancelar (c) limpar (h) histórico\n:");
		return scanner.nextLine();
	}

}
