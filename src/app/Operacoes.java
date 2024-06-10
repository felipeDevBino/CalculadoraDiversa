package app;

public class Operacoes {

	private int valorAtual = 0;
	private int valorDeMedia = 0;
	private int valorDeResto = 0;
	
	public int soma(int primeiroNumero, int segundoNumero, char operador) {
		int resultado = (primeiroNumero + segundoNumero);
		valorAtual += resultado;
		
		System.out.println("\nResultado dos números somados = " + resultado);
		return valorAtual;
	
	}

	public int subtracao(int primeiroNumero, int segundoNumero) {	
		int resultado = (primeiroNumero - segundoNumero);
		valorAtual -= resultado;

		System.out.println("\nResultado dos números subtraidos = " + resultado);
		return valorAtual;
	
	}

	public int multiplicacao(int primeiroNumero, int segundoNumero) {
		int resultado = (primeiroNumero * segundoNumero);
		valorAtual *= resultado;
		
		System.out.println("\nResultado dos números multiplicados = " + resultado);
		return valorAtual;
	
	}

	public int divisao(int primeiroNumero, int segundoNumero) {
		int resultado = (primeiroNumero / segundoNumero);
		valorAtual /= resultado;
		
		System.out.println("\nResultado dos números divididos = " + resultado);
		return valorAtual;
	
	}

	public int obtemMedia(int quantidade) {
		int media = 0;
		int quantiaDeNumeros = 0;
		
		for(int i = 0; i < quantidade; i++) {													 //Integer.parseInt(Start.scanner.nextLine());
			System.out.println("Digite o " + (quantiaDeNumeros + 1) + " número: "); int numero = 0;
			media += numero;
			quantiaDeNumeros++;
		}
		
		media /= quantiaDeNumeros;
		valorDeMedia += media;
		
		return valorDeMedia;
	}

	public int obtemRestoDividido(int primeiroNumero, int segundoNumero) {
		int resto = (primeiroNumero % segundoNumero);
		valorDeResto += resto;

		return valorDeResto;
	}  

}