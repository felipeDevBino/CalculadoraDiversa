package completa.modelo;

import java.util.List;

import javax.swing.JOptionPane;

import completa.historico.Historico;

import java.util.ArrayList;

public class LogicaDeDados {

	private List<Integer> primeiroOperador;
	private List<Integer> segundoOperador;
	private List<Integer> resultados;
	private boolean estaOperando = false;
	private String operador;
	private int resultado;

	public LogicaDeDados() {
		primeiroOperador = new ArrayList<>();
		segundoOperador = new ArrayList<>();
		resultados = new ArrayList<>();
	}

	public void adicionaNumero(int num) {
		primeiroOperador.add(num);
	}

	public void adicionaNumeroAOperar(int num) {
		segundoOperador.add(num);
	}
	
	public void setSeEstaOperando(boolean operando) {
		if (operando) {
			estaOperando = true;
		} else {
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
		for (Integer numero : numeros) {
			valor.append(numero);
		}
		int valorTotal = Integer.parseInt(valor.toString());
		return valorTotal;
	}

	private String logicaDeOperacao(Historico historico, String operador) {
		resultado = 0;
		if (getPrimeiroOperador().isEmpty() || getSegundoOperador().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Erro, insira ambos os valores para serem operados!");
			limpaNumerosRegistrados();
		} else {
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
			historico.registraNoHistorico(this, "", resultado);
			salvaResultado(resultado);
			limpaNumerosRegistrados();
			adicionaNumero(resultado);
			return resultado + "";
		}
		return "";
	}

	public String realizarOperacao(Historico historico, String operador) {
		return logicaDeOperacao(historico, operador);
	}

}
