package UD_10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_01 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_apellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_01 frame = new Ventana_01();
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
	public Ventana_01() {
		setTitle("Formulario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana_01.class.getResource("/resources/contact-form.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 237, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(138, 153, 86, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_apellido = new JTextField();
		txt_apellido.setBounds(138, 213, 86, 20);
		contentPane.add(txt_apellido);
		txt_apellido.setColumns(10);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(73, 153, 46, 14);
		contentPane.add(lbl_nombre);
		
		JLabel lbl_apellido = new JLabel("Apellido");
		lbl_apellido.setBounds(73, 213, 46, 14);
		contentPane.add(lbl_apellido);
		
		JButton btn_send = new JButton("Send");
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_nombre.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, txt_nombre.getText() + " " + txt_apellido.getText(), "Confirmación",JOptionPane.INFORMATION_MESSAGE);
					txt_nombre.setText("");
					txt_apellido.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Introduce los datos", "Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_send.setBounds(135, 258, 89, 23);
		contentPane.add(btn_send);
		
		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_nombre.setText("");
				txt_apellido.setText("");
			}
		});
		btn_cancel.setBounds(244, 258, 89, 23);
		contentPane.add(btn_cancel);
		
		JLabel lbl_healthImg = new JLabel("");
		lbl_healthImg.setIcon(new ImageIcon(Ventana_01.class.getResource("/resources/health.png")));
		lbl_healthImg.setBounds(438, 11, 256, 359);
		contentPane.add(lbl_healthImg);
	}
}
