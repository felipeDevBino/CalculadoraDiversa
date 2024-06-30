package model.rapido;

import java.util.ArrayList;
import java.util.List;

import view.rapida.CalcRapidaView;

public class HistoricoDados {

	private List<String> historico;

	public HistoricoDados() {
		historico = new ArrayList<>();
	}

	public void capturaDadosSalvos(CalcRapidaView view, int num1, int num2, String operador, int resultado) {
		String formatador = view.retornaCalculoFeito(num1, num2, operador, resultado);
		historico.add(formatador);
	}

	public List<String> obtemHistorico() {
		return historico;
	}

}
