package completa.modelo;

import java.util.List;

public class ApagarValores {

	public void apagaValor(List<Integer> valores) {
		int valor = valores.getLast();
		StringBuilder valorStr = new StringBuilder();
		valorStr.append(valor);
		if(valorStr.length() > 1) { 
			valorStr.deleteCharAt(valorStr.length() - 1);
			valor = Integer.parseInt(valorStr.toString());
			valores.removeLast();
			valores.add(valor);
		}else {
			valores.removeLast();
		}
	}
	
}
