package completa.acesso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import completa.historico.Historico;
import completa.modelo.ApagarValores;
import completa.modelo.CalculaMedia;
import completa.modelo.LogicaDeOperacao;
import start.Mensagens;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfaceCompleta {

	private JFrame frame;
	private JTextField textField;
	private LogicaDeOperacao dados;
	private Historico historico;
	private CalculaMedia media;
	private ApagarValores apagar;
	private boolean estaCalculandoMedia = false;
	private int quantidadeOperandos = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCompleta window = new InterfaceCompleta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceCompleta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dados = new LogicaDeOperacao();
		historico = new Historico();
		media = new CalculaMedia();
		apagar = new ApagarValores();

		frame = new JFrame();
		frame.getContentPane().setLayout(null);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(6);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(6);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn6.setBounds(347, 241, 99, 39);
		frame.getContentPane().add(btn6);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(5);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(5);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn5.setBounds(238, 241, 99, 39);
		frame.getContentPane().add(btn5);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(4);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(4);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn4.setBounds(129, 241, 99, 39);
		frame.getContentPane().add(btn4);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(7);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(7);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn7.setBounds(129, 291, 99, 39);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(8);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(8);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn8.setBounds(238, 291, 99, 39);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(9);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(9);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn9.setBounds(347, 291, 99, 39);
		frame.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(0);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(0);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn0.setBounds(129, 341, 99, 39);
		frame.getContentPane().add(btn0);

		JButton btnResultado = new JButton("=");
		btnResultado.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (estaCalculandoMedia) {
					quantidadeOperandos++;
					textField.setText("m:" + media.retornaMedia(dados, historico, quantidadeOperandos));

					quantidadeOperandos = 0;
				} else {
					textField.setText(dados.realizarOperacao(historico, dados.getOperador()));
					dados.setOperador(null);
				}
			}
		});
		btnResultado.setBounds(347, 341, 99, 39);
		frame.getContentPane().add(btnResultado);

		JButton btnVirgula = new JButton(",");
		btnVirgula.setBounds(238, 341, 99, 39);
		frame.getContentPane().add(btnVirgula);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.limpaNumerosRegistrados();
				historico.limpaHistorico();
				dados.setOperador(null);
				textField.setText("");
			}
		});
		btnClear.setBounds(129, 99, 91, 35);
		frame.getContentPane().add(btnClear);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(1);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(1);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn1.setBounds(129, 191, 99, 39);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(2);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(2);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn2.setBounds(238, 191, 99, 39);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getOperador() == null) {
					dados.adicionaNumero(3);
					textField.setText(dados.getValorPrimeiroOperador());
				} else {
					dados.adicionaNumeroAOperar(3);
					textField.setText(dados.getValorSegundoOperador());
					dados.setSeEstaOperando(true);
				}
			}
		});
		btn3.setBounds(347, 191, 99, 39);
		frame.getContentPane().add(btn3);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField.setBounds(23, 50, 410, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Calculadora Completa");
		lblNewLabel.setBounds(93, 11, 291, 49);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 158, 109, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Científica");
		lblNewLabel_1.setBounds(32, 145, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnSobra = new JButton("SOBRA");
		btnSobra.setBounds(10, 241, 99, 39);
		frame.getContentPane().add(btnSobra);

		JButton btnParImpar = new JButton("PAR/ÍMPAR");
		btnParImpar.setBounds(10, 291, 99, 39);
		frame.getContentPane().add(btnParImpar);

		JLabel lblNewLabel_2 = new JLabel("@felipeDevBino");
		lblNewLabel_2.setBounds(345, 388, 101, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("felipereisbino@gmail.com");
		lblNewLabel_2_1.setBounds(158, 388, 148, 14);
		frame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("5541998738614");
		lblNewLabel_2_1_1.setBounds(23, 388, 99, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JButton btnHistorico = new JButton("HISTÓRICO");
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (historico.verificaSeHaHistorico()) {

					// TODO TELA COM BARRA DE ROLAGEM

					JOptionPane.showMessageDialog(null, historico.getHistorico(), "Histórico",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Não há operações feitas registradas no histórico", "Erro",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnHistorico.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnHistorico.setBounds(238, 99, 91, 35);
		frame.getContentPane().add(btnHistorico);

		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnOff.setBounds(23, 99, 91, 35);
		frame.getContentPane().add(btnOff);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!dados.getPrimeiroOperador().isEmpty() && !dados.getSegundoOperador().isEmpty()) {
					textField.setText(dados.realizarOperacao(historico, dados.getOperador()) + " + ");
					if (estaCalculandoMedia) {
						quantidadeOperandos++;
					}
				} else {
					dados.setOperador("+");
					textField.setText(dados.getOperador());

					if (dados.getEstadoOperando()) {
						btnResultado.getAction();
						dados.setSeEstaOperando(false);
					}
					if (estaCalculandoMedia) {
						quantidadeOperandos++;
					}
				}
			}
		});
		btnSoma.setBounds(140, 145, 75, 35);
		frame.getContentPane().add(btnSoma);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!dados.getPrimeiroOperador().isEmpty() && !dados.getSegundoOperador().isEmpty()) {
					textField.setText(dados.realizarOperacao(historico, dados.getOperador()) + " - ");
				} else {
					dados.setOperador("-");
					textField.setText(dados.getOperador());

					if (dados.getEstadoOperando()) {
						btnResultado.getAction();
						dados.setSeEstaOperando(false);
					}
				}
			}
		});
		btnSubtracao.setBounds(212, 145, 75, 35);
		frame.getContentPane().add(btnSubtracao);

		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!dados.getPrimeiroOperador().isEmpty() && !dados.getSegundoOperador().isEmpty()) {
					textField.setText(dados.realizarOperacao(historico, dados.getOperador()) + " * ");
				} else {
					dados.setOperador("*");
					textField.setText(dados.getOperador());

					if (dados.getEstadoOperando()) {
						btnResultado.getAction();
						dados.setSeEstaOperando(false);
					}
				}
			}
		});
		btnMultiplicacao.setBounds(286, 145, 75, 35);
		frame.getContentPane().add(btnMultiplicacao);

		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!dados.getPrimeiroOperador().isEmpty() && !dados.getSegundoOperador().isEmpty()) {
					textField.setText(dados.realizarOperacao(historico, dados.getOperador()) + " / ");
				} else {
					dados.setOperador("/");
					textField.setText(dados.getOperador());

					if (dados.getEstadoOperando()) {
						btnResultado.getAction();
						dados.setSeEstaOperando(false);
					}
				}
			}
		});
		btnDivisao.setBounds(358, 145, 75, 35);
		frame.getContentPane().add(btnDivisao);

		JButton btnMedia = new JButton("MÉDIA");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (estaCalculandoMedia) {
					btnResultado.setText("=");
					btnSubtracao.setVisible(true);
					btnMultiplicacao.setVisible(true);
					btnDivisao.setVisible(true);
					btnMedia.setText("MÉDIA");
					estaCalculandoMedia = false;
				} else {
					btnResultado.setText("= MÉDIA");
					btnSubtracao.setVisible(false);
					btnMultiplicacao.setVisible(false);
					btnDivisao.setVisible(false);
					btnMedia.setText("COMUM");
					estaCalculandoMedia = true;
				}
			}
		});
		btnMedia.setBounds(10, 191, 99, 39);
		frame.getContentPane().add(btnMedia);

		JButton btnRecursivo = new JButton("RECURSIVO");
		btnRecursivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRecursivo.setBounds(10, 341, 99, 39);
		frame.getContentPane().add(btnRecursivo);

		JLabel lblNewLabel_3 = new JLabel("Telefone");
		lblNewLabel_3.setBounds(32, 406, 56, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(212, 406, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("GitHub");
		lblNewLabel_5.setBounds(369, 406, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnOff_1 = new JButton("<=");
		btnOff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dados.getSegundoOperador().isEmpty()) {
					apagar.apagaValor(dados.getPrimeiroOperador());
					textField.setText(dados.getValorPrimeiroOperador());
				} else if (!dados.getPrimeiroOperador().isEmpty() && !dados.getSegundoOperador().isEmpty()) {
					apagar.apagaValor(dados.getSegundoOperador());
					textField.setText(dados.getValorSegundoOperador());
				}
			}
		});
		btnOff_1.setBounds(342, 99, 91, 35);
		frame.getContentPane().add(btnOff_1);
	}
}
