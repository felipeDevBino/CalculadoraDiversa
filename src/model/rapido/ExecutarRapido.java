package model.rapido;

import java.util.Scanner;

import controller.rapida.EntradaDados;
import controller.rapida.HistoricoControle;
import view.rapida.CalcRapidaView;

public class ExecutarRapido {

	private HistoricoControle controllerHistorico;
	private HistoricoDados historicoModel;
	private EntradaDados modelDados;
	private CalcRapidaView view;

	public ExecutarRapido() {
		controllerHistorico = new HistoricoControle();
		historicoModel = new HistoricoDados();
		modelDados = new EntradaDados();
		view = new CalcRapidaView();
	}

	public void logicaDeExecucao(Scanner scanner) {
		int num1 = 0;
		int num2 = 0;
		int resultado;
		String operador = null;
		view.imprimeMensagem(":");
		num1 = modelDados.insercaoDeNumero(scanner);
		do {
			operador = modelDados.operacao(scanner, view);

			switch (operador) {
			case "+":
				view.imprimeMensagemOperacao(num1, operador);
				num2 = modelDados.insercaoDeNumero(scanner);
				resultado = (num1 + num2);
				view.imprimeResultado(num1, num2, operador, resultado);
				controllerHistorico.registrarNoHistorico(historicoModel, view, num1, num2, operador, resultado);
				num1 = (num1 + num2);
				break;
			case "-":
				view.imprimeMensagemOperacao(num1, operador);
				num2 = modelDados.insercaoDeNumero(scanner);
				resultado = (num1 - num2);
				view.imprimeResultado(num1, num2, operador, resultado);
				controllerHistorico.registrarNoHistorico(historicoModel, view, num1, num2, operador, resultado);
				num1 = (num1 - num2);
				break;
			case "*":
				view.imprimeMensagemOperacao(num1, operador);
				num2 = modelDados.insercaoDeNumero(scanner);
				resultado = (num1 * num2);
				view.imprimeResultado(num1, num2, operador, resultado);
				controllerHistorico.registrarNoHistorico(historicoModel, view, num1, num2, operador, resultado);
				num1 = (num1 * num2);
				break;
			case "/":
				view.imprimeMensagemOperacao(num1, operador);
				num2 = modelDados.insercaoDeNumero(scanner);
				resultado = (num1 / num2);
				view.imprimeResultado(num1, num2, operador, resultado);
				controllerHistorico.registrarNoHistorico(historicoModel, view, num1, num2, operador, resultado);
				num1 = (num1 / num2);
				break;
			case "0":
				view.imprimeMensagem("Calculadora rápida encerrada.");
				return;
			case "c":
				view.imprimeMensagem(":");
				num1 = modelDados.insercaoDeNumero(scanner);
				break;
			case "h":
				controllerHistorico.imprimirHistorico(historicoModel, view);
				break;
			default:
				view.imprimeMensagem("Comando inválido!");
				break;
			}
		} while (!operador.equals("0"));

	}

}
