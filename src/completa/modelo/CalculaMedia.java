package completa.modelo;

import completa.historico.Historico;

public class CalculaMedia {

	public int retornaMedia(LogicaDeDados dados, Historico historico, int quantidadeOperandos) {
		int valor1 = Integer.parseInt(dados.getValorPrimeiroOperador());
		int valor2 = Integer.parseInt(dados.getValorSegundoOperador());;
		int soma = valor1 + valor2;
		int media = soma / quantidadeOperandos;
		
		historico.registraNoHistorico(dados, "m:", media);
		
		return media;
	}

}
