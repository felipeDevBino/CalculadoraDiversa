package model;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	private static List<String> historico = new ArrayList<>();
	
	public static void capturaDadosSalvos(int num1, int num2, String operador) {
		String formatador = num1 + " " + operador + " " + num2; 
		historico.add(formatador);
	}
	
	public static List<String> obtemHistorico() {
		return historico;
	}

}
