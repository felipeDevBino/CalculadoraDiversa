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
import completa.modelo.LogicaDeDados;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfaceCompleta {

	private JFrame frame;
	private JTextField textField;
	private LogicaDeDados dados;
	private Historico historico;

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
		dados = new LogicaDeDados();
		historico = new Historico();

		frame = new JFrame();
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(347, 241, 99, 39);
		frame.getContentPane().add(btnNewButton);
 
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(238, 241, 99, 39);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(129, 241, 99, 39);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setBounds(129, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
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
		btnNewButton_4.setBounds(238, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.addActionListener(new ActionListener() {
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
		btnNewButton_5.setBounds(347, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.addActionListener(new ActionListener() {
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
		btnNewButton_6.setBounds(129, 341, 99, 39);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton(",");
		btnNewButton_7.setBounds(238, 341, 99, 39);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("C");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.limpaNumerosRegistrados();
				historico.limpaHistorico();
				dados.setOperador(null);
				textField.setText("");
			}
		});
		btnNewButton_8.setBounds(183, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_2_1 = new JButton("1");
		btnNewButton_2_1.addActionListener(new ActionListener() {
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
		btnNewButton_2_1.setBounds(129, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1);

		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
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
		btnNewButton_1_1.setBounds(238, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_9 = new JButton("3");
		btnNewButton_9.addActionListener(new ActionListener() {
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
		btnNewButton_9.setBounds(347, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_9);

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

		JButton btnNewButton_2_1_1 = new JButton("MÉDIA");
		btnNewButton_2_1_1.setBounds(10, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1_1);

		JButton btnNewButton_2_1_3 = new JButton("SOBRA");
		btnNewButton_2_1_3.setBounds(10, 241, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1_3);

		JButton btnNewButton_2_1_4 = new JButton("PAR/ÍMPAR");
		btnNewButton_2_1_4.setBounds(10, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1_4);

		JLabel lblNewLabel_2 = new JLabel("@felipeDevBino");
		lblNewLabel_2.setBounds(305, 388, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("felipereisbino@gmail.com");
		lblNewLabel_2_1.setBounds(171, 388, 124, 14);
		frame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("5541998738614");
		lblNewLabel_2_1_1.setBounds(73, 388, 99, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JButton btnNewButton_10 = new JButton("HISTÓRICO");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (historico.verificaSeHaHistorico()) {
					
					//TODO TELA COM BARRA DE ROLAGEM
					
					JOptionPane.showMessageDialog(null, historico.getHistorico(), "Histórico",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Não há operações feitas registradas no histórico", "Erro",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_10.setBounds(56, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_10);

		JButton botaoResultado = new JButton("=");
		botaoResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(dados.realizarOperacao(historico, dados.getOperador()));
				dados.setOperador(null);
			}
		});
		botaoResultado.setBounds(347, 341, 99, 39);
		frame.getContentPane().add(botaoResultado);

		JButton btnNewButton_8_1 = new JButton("OFF");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.setEnabled(false);
			}
		});
		btnNewButton_8_1.setBounds(315, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_8_1);

		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.setOperador("+");
				textField.setText(dados.getOperador());
				if (dados.getEstadoOperando()) {
					botaoResultado.getAction();
					dados.setSeEstaOperando(false);
				}
			}
		});
		btnNewButton_11.setBounds(140, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_11_1 = new JButton("-");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.setOperador("-");
				textField.setText(dados.getOperador());
				if (dados.getEstadoOperando()) {
					botaoResultado.getAction();
					dados.setSeEstaOperando(false);
				}

			}
		});
		btnNewButton_11_1.setBounds(212, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_1);

		JButton btnNewButton_11_2 = new JButton("*");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.setOperador("*");
				textField.setText(dados.getOperador());
				if (dados.getEstadoOperando()) {
					botaoResultado.getAction();
					dados.setSeEstaOperando(false);
				}
			}
		});
		btnNewButton_11_2.setBounds(286, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_2);

		JButton btnNewButton_11_3 = new JButton("/");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dados.setOperador("/");
				textField.setText(dados.getOperador());
				if (dados.getEstadoOperando()) {
					botaoResultado.getAction();
					dados.setSeEstaOperando(false);
				}
			}
		});
		btnNewButton_11_3.setBounds(358, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_3);

		JButton btnNewButton_2_1_4_1 = new JButton("RECURSIVO");
		btnNewButton_2_1_4_1.setBounds(10, 341, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1_4_1);
	}

}
