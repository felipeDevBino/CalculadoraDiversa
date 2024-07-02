package model.completa;

import java.util.List;

import controller.completa.EntradaDados;

import java.util.ArrayList;

public class LogicaDeDados {
	
	private List<Integer> primeiroOperador;
	private List<Integer> segundoOperador;
	private boolean estaOperando = false;
	
	public LogicaDeDados() {
		primeiroOperador = new ArrayList<>();
		segundoOperador = new ArrayList<>();
	}

	public void setPrimeiroOperador(int num) {
		primeiroOperador.add(num);
	}
	
	public void setSegundoOperador(int num) {
		segundoOperador.add(num);
	}
	
	public void setSeEstaOperando(boolean operando) {
		if(operando) {
			estaOperando = true;
		}else {
			estaOperando = false;
		}
	}
	
	public boolean getEstadoOperando() {
		return estaOperando;
	}
	
	public List<Integer> getPrimeiroOperador() {
		return primeiroOperador;
	}
	
	public List<Integer> getSegundoOperador() {
		return segundoOperador;
	}
	
	public void limpaPrimeiroOperador() {
		primeiroOperador.clear();
	}

	public void limpaSegundoOperador() {
		segundoOperador.clear();
	}
	
	public String logicaDeOperacao(EntradaDados controller, String operador) {
		int resultado = 0;
		int primeiro = controller.atualizaListaComResultado(primeiroOperador);
		int segundo = controller.atualizaListaComResultado(segundoOperador);
		
		switch (operador) {
		case "+":
			resultado = (primeiro + segundo);
			break;
		case "-":
			resultado = (primeiro - segundo);
			break;
		case "*":
			resultado = (primeiro * segundo);
			break;
		case "/":
			resultado = (primeiro / segundo);
			break;
		}
		controller.limpaNumerosRegistrados(this);
		controller.adicionaNumero(this, resultado);
		return controller.mostraTexto(resultado+"");
	}

}
