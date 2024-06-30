package controller.rapida;

import model.rapido.HistoricoDados;
import view.rapida.CalcRapidaView;

public class HistoricoControle {

	public void registrarNoHistorico(HistoricoDados historicoModel, CalcRapidaView view, int num1, int num2,
			String operador, int resultado) {
		historicoModel.capturaDadosSalvos(view, num1, num2, operador, resultado);
	}

	public void imprimirHistorico(HistoricoDados historicoModel, CalcRapidaView view) {
		for (String historico : historicoModel.obtemHistorico()) {
			view.imprimeMensagem(historico);
		}
	}

}
