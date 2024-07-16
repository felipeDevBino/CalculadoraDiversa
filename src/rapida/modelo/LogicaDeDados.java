package rapida.modelo;

import java.util.Scanner;

import rapida.acesso.EntradaDados;
import rapida.historico.Historico;
import start.Mensagens;

public class LogicaDeDados {

	private Historico historico;
	private EntradaDados dados;
	private Mensagens mensagem;

	public LogicaDeDados() {
		historico = new Historico();
		dados = new EntradaDados();
		mensagem = new Mensagens();
	}

	public void logicaDeExecucao(Scanner scanner) {
		int num1 = 0;
		int num2 = 0;
		int resultado;
		String operador = null;
		mensagem.imprimeMensagem(":");
		num1 = dados.insercaoDeNumero(scanner);
		do {
			operador = dados.operacao(scanner, mensagem);

			switch (operador) {
			case "+":
				mensagem.imprimeMensagemOperacao(num1, operador);
				num2 = dados.insercaoDeNumero(scanner);
				resultado = (num1 + num2);
				mensagem.imprimeResultado(num1, num2, operador, resultado);
				historico.capturaDadosSalvos(mensagem, num1, num2, operador, resultado);
				num1 = (num1 + num2);
				break;
			case "-":
				mensagem.imprimeMensagemOperacao(num1, operador);
				num2 = dados.insercaoDeNumero(scanner);
				resultado = (num1 - num2);
				mensagem.imprimeResultado(num1, num2, operador, resultado);
				historico.capturaDadosSalvos(mensagem, num1, num2, operador, resultado);
				num1 = (num1 - num2);
				break;
			case "*":
				mensagem.imprimeMensagemOperacao(num1, operador);
				num2 = dados.insercaoDeNumero(scanner);
				resultado = (num1 * num2);
				mensagem.imprimeResultado(num1, num2, operador, resultado);
				historico.capturaDadosSalvos(mensagem, num1, num2, operador, resultado);
				num1 = (num1 * num2);
				break;
			case "/":
				mensagem.imprimeMensagemOperacao(num1, operador);
				num2 = dados.insercaoDeNumero(scanner);
				resultado = (num1 / num2);
				mensagem.imprimeResultado(num1, num2, operador, resultado);
				historico.capturaDadosSalvos(mensagem, num1, num2, operador, resultado);
				num1 = (num1 / num2);
				break;
			case "0":
				mensagem.imprimeMensagem("Calculadora rápida encerrada.");
				return;
			case "c":
				mensagem.imprimeMensagem(":");
				num1 = dados.insercaoDeNumero(scanner);
				historico.limpaHistorico();
				break;
			case "h":
				historico.getHistorico();
				break;
			default:
				mensagem.imprimeMensagem("Comando inválido!");
				break;
			}
		} while (!operador.equals("0"));

	}

}
