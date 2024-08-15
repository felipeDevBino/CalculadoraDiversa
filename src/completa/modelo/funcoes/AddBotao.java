package completa.modelo.funcoes;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AddBotao {
	
	private JButton botao;
	
	public AddBotao(JFrame frame, String texto, int x, int y, int largura, int tamanho, ActionListener actionListener) {
		botao = new JButton(texto);
		botao.setBounds(x, y, largura, tamanho);
		if(actionListener == null) {
			botao.addActionListener(actionListener);
		}
		frame.getContentPane().add(botao);
	}
	
	public JButton getBotao() {
		return botao;
	}

}
