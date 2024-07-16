package completa.modelo;

import java.util.List;

import completa.historico.Historico;
import start.Mensagens;

import java.util.ArrayList;

public class LogicaDeDados {
	
	private List<Integer> primeiroOperador;
	private List<Integer> segundoOperador;
	private List<Integer> resultados;
	private boolean estaOperando = false;
	private String operador;
	private int resultado;
	private Mensagens mensagem;
	
	public LogicaDeDados() {
		primeiroOperador = new ArrayList<>();
		segundoOperador = new ArrayList<>();
		resultados = new ArrayList<>();
		mensagem = new Mensagens();
	}

	public void adicionaNumero(int num) {
		primeiroOperador.add(num);
	}
	
	public void adicionaNumeroAOperar(int num) {
		segundoOperador.add(num);
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
	
	public String getOperador() {
		return operador;
	}
	
	public void setOperador(String info) {
		operador = info;
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
	
	public void limpaNumerosRegistrados() {
		limpaPrimeiroOperador();
		limpaSegundoOperador();
	}
	
	private void salvaResultado(int resultado) {
		resultados.add(resultado);
	}
	
	public List<Integer> getResultados() {
		return resultados;
	}
	
	public String getValorPrimeiroOperador() {
		StringBuilder valor = new StringBuilder();
		for (Integer numero : getPrimeiroOperador()) {
			valor.append(numero);
		}
		return valor.toString();
	}

	public String getValorSegundoOperador() {
		StringBuilder valor = new StringBuilder();
		for (Integer numero : getSegundoOperador()) {
			valor.append(numero);
		}
		return valor.toString();
	}
	
	public int atualizaListaComResultado(List<Integer> numeros) {
		StringBuilder valor = new StringBuilder();
		for(Integer numero : numeros) {
			valor.append(numero);
		}
		int valorTotal = Integer.parseInt(valor.toString());
		return valorTotal;
	}

	private String logicaDeOperacao(Historico historico, String operador) {
		resultado = 0;
		int primeiro = atualizaListaComResultado(primeiroOperador);
		int segundo = atualizaListaComResultado(segundoOperador);
		
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
		historico.registrarNoHistorico(this, resultado);
		salvaResultado(resultado);
		limpaNumerosRegistrados();
		setPrimeiroOperador(resultado);
		limpaSegundoOperador();
		return mensagem.getTexto(resultado+"");
	}

	public String realizarOperacao(Historico historico, String operador) {
		return logicaDeOperacao(historico, operador);
	}

}
