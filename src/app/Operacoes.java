package app;

public class Operacoes {

	private int valorAtual = 0;
	
	public int soma(int primeiroNumero, int segundoNumero, char operador) {
		int resultado = (primeiroNumero + segundoNumero);
		valorAtual += resultado;
		
		return valorAtual;
	
	}

	public int subtracao(int primeiroNumero, int segundoNumero) {	
		int resultado = (primeiroNumero - segundoNumero);
		valorAtual -= resultado;
		
		return valorAtual;
	
	}

	public int multiplicacao(int primeiroNumero, int segundoNumero) {
		int resultado = (primeiroNumero * segundoNumero);
		valorAtual *= resultado;
		
		return valorAtual;
	
	}

	public int divisao(int primeiroNumero, int segundoNumero) {
		int resultado = (primeiroNumero / segundoNumero);
		valorAtual /= resultado;
		
		return valorAtual;
	
	}

	public int obtemMedia(int primeiroNumero, int segundoNumero) {
		return 0;
	}

	public int obtemRestoDividido(int primeiroNumero, int segundoNumero) {
		return 0;
	}  

}