package controller;

import model.Historico;

public class Acesso {
	
	public void registrarNoHistorico(int num1, int num2, String operador) {
		Historico.capturaDadosSalvos(num1, num2, operador);
	}

	public void imprimirHistorico() {
		for(String historico : Historico.obtemHistorico()) {
			System.out.println(historico);
		}
	}
	
}
