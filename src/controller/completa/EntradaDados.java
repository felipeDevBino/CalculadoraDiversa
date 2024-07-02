package controller.completa;

import java.util.List;

import model.completa.LogicaDeDados;

public class EntradaDados {

	public String mostraTexto(String texto) {
		return texto;
	}

	public String getValorPrimeiroOperador(LogicaDeDados model) {
		StringBuilder valor = new StringBuilder();
		for (Integer numero : model.getPrimeiroOperador()) {
			valor.append(numero);
		}
		return valor.toString();
	}

	public String getValorSegundoOperador(LogicaDeDados model) {
		StringBuilder valor = new StringBuilder();
		for (Integer numero : model.getSegundoOperador()) {
			valor.append(numero);
		}
		return valor.toString();
	}

	public void defineSeEstaOperando(LogicaDeDados model, boolean definicao) {
		if (definicao) {
			model.setSeEstaOperando(true);
		} else {
			model.setSeEstaOperando(false);
		}
	}

	public boolean verificaSeEstaOperando(LogicaDeDados model) {
		return model.getEstadoOperando();
	}

	public int atualizaListaComResultado(List<Integer> numeros) {
		int valorTotal = 0;
		
		StringBuilder valor = new StringBuilder();
		for(Integer numero : numeros) {
			valor.append(numero);
		}
		valorTotal = Integer.parseInt(valor.toString());
		
		return valorTotal;
	}

	public void adicionaNumero(LogicaDeDados model, int num) {
		model.setPrimeiroOperador(num);
	}

	public void adicionaNumeroAOperar(LogicaDeDados model, int num) {
		model.setSegundoOperador(num);
		model.setSeEstaOperando(true);
	}

	public void limpaNumerosRegistrados(LogicaDeDados model) {
		model.limpaPrimeiroOperador();
		model.limpaSegundoOperador();
	}

	public void limpaNumerosOperadores(LogicaDeDados model) {
		model.limpaSegundoOperador();
	}

}
