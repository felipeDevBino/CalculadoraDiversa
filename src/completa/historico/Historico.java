package completa.historico;

import java.util.ArrayList;
import java.util.List;
import completa.modelo.LogicaDeDados;
import start.Mensagens;

public class Historico {

	private List<String> historico;
	private StringBuilder mensagemStr;

	public Historico() {
		historico = new ArrayList<>();
	}

	public void limpaHistorico() {
		historico.clear();
	}

	public boolean verificaSeHaHistorico() {
		if (historico.isEmpty()) {
			return false;
		}
		return true;
	}

	public String getHistorico() {
		StringBuilder get = new StringBuilder();
		for (String percorreHistorico : historico) {
			get.append(percorreHistorico);
		}
		return get.toString();
	}

	private void registraNoHistorico(LogicaDeDados dados, int resultado) {
		mensagemStr = new StringBuilder();

		mensagemStr.append("(" + dados.getValorPrimeiroOperador() + " ")
		.append(dados.getOperador() + " ")
		.append(dados.getValorSegundoOperador() + ")")
		.append("\n = " + resultado + "\n");

		historico.add(mensagemStr.toString());
	}

	public void registrarNoHistorico(LogicaDeDados dados, int resultado) {
		registraNoHistorico(dados, resultado);
	}

}
