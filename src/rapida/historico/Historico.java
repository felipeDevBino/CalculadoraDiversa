package rapida.historico;

import java.util.ArrayList;
import java.util.List;

import start.Mensagens;

public class Historico {

	private List<String> historico;

	public Historico() {
		historico = new ArrayList<>();
	}

	public void capturaDadosSalvos(Mensagens mensagem, int num1, int num2, String operador, int resultado) {
		String formatador = mensagem.retornaCalculoFeito(num1, num2, operador, resultado);
		historico.add(formatador);
	}

	private List<String> obtemHistorico() {
		return historico;
	}

	public void getHistorico() {
		if (obtemHistorico().isEmpty()) {
			System.out.println("\nNão há histórico salvo!");
		} else {
			for (String operacao : obtemHistorico()) {
				System.out.println("\n" + operacao);
			}
		}
	}

	public void limpaHistorico() {
		historico.clear();
	}

}
