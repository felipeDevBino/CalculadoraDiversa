package start;

public class Mensagens {

	public void imprimeMensagemOperacao(int num, String operacao) {
		System.out.println(num + " " + operacao + " ");
	}

	public void imprimeResultado(int num1, int num2, String operacao, int resultado) {
		System.out.println(num1 + " " + operacao + " " + num2 + " = " + resultado);
	}

	public String retornaCalculoFeito(int num1, int num2, String operador, int resultado) {
		return num1 + " " + operador + " " + num2 + " = " + resultado;
	}

	public void imprimeMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public String getTexto(String mensagem) {
		return mensagem;
	}

}
