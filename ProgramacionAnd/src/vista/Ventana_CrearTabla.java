package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_CrearTabla extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_CrearTabla frame = new Ventana_CrearTabla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_CrearTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 56, 234, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_Txt_Nombre = new JLabel("Nombre:");
		lbl_Txt_Nombre.setBounds(10, 25, 111, 20);
		contentPane.add(lbl_Txt_Nombre);
		
		JButton btn_Accept = new JButton("Crear");
		btn_Accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Main.mDB.createDB(textField.getText()));
				textField.setText("");
				Main.vct.setVisible(false);
			}
		});
		btn_Accept.setBounds(10, 127, 89, 23);
		contentPane.add(btn_Accept);
		
		JButton btn_Cancel = new JButton("Cancelar");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				Main.vct.setVisible(false);
			}
		});
		btn_Cancel.setBounds(155, 127, 89, 23);
		contentPane.add(btn_Cancel);
	}
}
