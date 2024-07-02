package view.completa;

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

import controller.completa.EntradaDados;
import model.completa.LogicaDeDados;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalcCompletaView {

	private JFrame frame;
	private JTextField textField;
	private LogicaDeDados model;
	private EntradaDados controller;
	private String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcCompletaView window = new CalcCompletaView();
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
	public CalcCompletaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		model = new LogicaDeDados();
		controller = new EntradaDados();

		frame = new JFrame();
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 6);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 6);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton.setBounds(347, 241, 99, 39);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 5);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 5);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_1.setBounds(238, 241, 99, 39);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 4);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 4);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_2.setBounds(129, 241, 99, 39);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 7);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 7);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_3.setBounds(129, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 8);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 8);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_4.setBounds(238, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 9);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 9);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_5.setBounds(347, 291, 99, 39);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 0);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 0);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
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
				controller.limpaNumerosRegistrados(model);
				operador = null;
				textField.setText("");
			}
		});
		btnNewButton_8.setBounds(183, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_2_1 = new JButton("1");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 1);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 1);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_2_1.setBounds(129, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1);

		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 2);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 2);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
				}
			}
		});
		btnNewButton_1_1.setBounds(238, 191, 99, 39);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_9 = new JButton("3");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == null) {
					controller.adicionaNumero(model, 3);
					textField.setText(controller.getValorPrimeiroOperador(model));
				} else {
					controller.adicionaNumeroAOperar(model, 3);
					textField.setText(controller.getValorSegundoOperador(model));
					controller.defineSeEstaOperando(model, true);
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
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_10.setBounds(56, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_10);

		JButton botaoResultado = new JButton("=");
		botaoResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if (operador != null) {
					textField.setText(model.logicaDeOperacao(controller, operador));
					operador = null;
//				}
			}
		});
		botaoResultado.setBounds(347, 341, 99, 39);
		frame.getContentPane().add(botaoResultado);

		JButton btnNewButton_8_1 = new JButton("OFF");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setEnabled(false);
				frame.setVisible(false);
			}
		});
		btnNewButton_8_1.setBounds(315, 99, 91, 35);
		frame.getContentPane().add(btnNewButton_8_1);

		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "+";
				textField.setText(operador);
				if (controller.verificaSeEstaOperando(model)) {
					botaoResultado.getAction();
					controller.defineSeEstaOperando(model, false);
				}
			}
		});
		btnNewButton_11.setBounds(140, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_11_1 = new JButton("-");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "-";
				textField.setText(operador);
				if (controller.verificaSeEstaOperando(model)) {
					botaoResultado.getAction();
					controller.defineSeEstaOperando(model, false);
				}

			}
		});
		btnNewButton_11_1.setBounds(212, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_1);

		JButton btnNewButton_11_2 = new JButton("*");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "*";
				textField.setText(operador);
				if (controller.verificaSeEstaOperando(model)) {
					botaoResultado.getAction();
					controller.defineSeEstaOperando(model, false);
				}
			}
		});
		btnNewButton_11_2.setBounds(286, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_2);

		JButton btnNewButton_11_3 = new JButton("/");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "/";
				textField.setText(operador);
				if (controller.verificaSeEstaOperando(model)) {
					botaoResultado.getAction();
					controller.defineSeEstaOperando(model, false);
				}
			}
		});
		btnNewButton_11_3.setBounds(358, 145, 75, 35);
		frame.getContentPane().add(btnNewButton_11_3);

		JButton btnNewButton_2_1_4_1 = new JButton("PAR/ÍMPAR");
		btnNewButton_2_1_4_1.setBounds(10, 341, 99, 39);
		frame.getContentPane().add(btnNewButton_2_1_4_1);
	}

}
