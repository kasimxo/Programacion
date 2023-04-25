package UD_10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ventana_02 extends JFrame {
	
	private String operationRaw;
	private JLabel lbl_operation;
	private JLabel lbl_resultado;
	private List<Integer> operando;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_02 frame = new Ventana_02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void refresh() {
		lbl_operation.setText(operationRaw);
	}

	/**
	 * Create the frame.
	 */
	public Ventana_02() {
		
		operationRaw = "";
		
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_1.getText();
				refresh();
			}
		});
		btn_1.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_1.setBounds(34, 243, 40, 40);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_2.getText();
				refresh();
			}
		});
		btn_2.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_2.setBounds(84, 243, 40, 40);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_3.getText();
				refresh();
			}
		});
		btn_3.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_3.setBounds(134, 243, 40, 40);
		contentPane.add(btn_3);
		
		this.lbl_operation = new JLabel("");
		lbl_operation.setText(operationRaw);
		lbl_operation.setOpaque(true);
		lbl_operation.setBackground(Color.WHITE);
		lbl_operation.setBounds(10, 10, 284, 30);
		contentPane.add(lbl_operation);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar();
			}
		});
		btn_equal.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_equal.setBounds(184, 243, 40, 40);
		contentPane.add(btn_equal);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_plus.getText();
				refresh();
			}
		});
		btn_plus.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_plus.setBounds(184, 192, 40, 40);
		contentPane.add(btn_plus);
		
		JButton btn_del = new JButton("C");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw = "";
				lbl_resultado.setText("");
				refresh();
			}
		});
		btn_del.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_del.setBounds(184, 141, 40, 40);
		contentPane.add(btn_del);
		
		this.lbl_resultado = new JLabel("");
		lbl_resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_resultado.setOpaque(true);
		lbl_resultado.setBackground(Color.WHITE);
		lbl_resultado.setBounds(10, 40, 284, 30);
		contentPane.add(lbl_resultado);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_4.getText();
				refresh();
			}
		});
		btn_4.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_4.setBounds(34, 192, 40, 40);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_5.getText();
				refresh();
			}
		});
		btn_5.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_5.setBounds(84, 192, 40, 40);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_6.getText();
				refresh();
			}
		});
		btn_6.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_6.setBounds(134, 192, 40, 40);
		contentPane.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_7.getText();
				refresh();
			}
		});
		btn_7.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_7.setBounds(34, 141, 40, 40);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_8.getText();
				refresh();
			}
		});
		btn_8.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_8.setBounds(84, 141, 40, 40);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_9.getText();
				refresh();
			}
		});
		btn_9.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_9.setBounds(134, 141, 40, 40);
		contentPane.add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationRaw += btn_0.getText();
				refresh();
			}
		});
		btn_0.setFont(new Font("Consolas", Font.BOLD, 10));
		btn_0.setBounds(84, 294, 40, 40);
		contentPane.add(btn_0);
	}

	protected void operar() {
		operando = new ArrayList<Integer>();
		String[] operandos = operationRaw.split("\\+");
		int solution = 0;
		for (String string : operandos) {
			operando.add(Integer.parseInt(string));
		}
		for (Integer parametro : operando) {
			solution += parametro;
		}
		lbl_resultado.setText(String.valueOf(solution));
	}
	
	
	
}
