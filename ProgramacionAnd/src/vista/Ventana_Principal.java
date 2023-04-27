package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ManejaDb;
import main.Main;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;

public class Ventana_Principal extends JFrame {

	private JLabel lbl_screen;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal frame = new Ventana_Principal();
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
	public Ventana_Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana_Principal.class.getResource("/resources/base-de-datos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_mostrarTablas = new JButton("Mostrar Tablas");
		btn_mostrarTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> tablas = Main.mDB.mostrarTablas();
				String tablasPrint = "";
				for (String tabla : tablas) {
					tablasPrint += tabla + "<br/>";
					//lbl_screen.setText(lbl_screen.getText() +"#10"+ tabla);
				}
				//tablasPrint += "";
				lbl_screen.setText("<html><body>" + tablasPrint + "</body></html>");
			}
		});
		btn_mostrarTablas.setBounds(10, 227, 133, 23);
		contentPane.add(btn_mostrarTablas);
		
		lbl_screen = new JLabel("");
		lbl_screen.setVerticalAlignment(SwingConstants.TOP);
		lbl_screen.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_screen.setBackground(Color.WHITE);
		lbl_screen.setBounds(10, 62, 414, 107);
		lbl_screen.setOpaque(true);
		contentPane.add(lbl_screen);
		
		JButton btn_createTable = new JButton("Create table");
		btn_createTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Main.vct.setVisible(true);
					clearScreen();
			}
		});
		btn_createTable.setBounds(283, 227, 141, 23);
		contentPane.add(btn_createTable);
		
		JButton btn_changeDataBase_01 = new JButton("andres");
		btn_changeDataBase_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					clearScreen();
					Main.mDB.changeDataBase("andres.db");
					Main.vp.setTitle("andres");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_changeDataBase_01.setBounds(53, 11, 65, 23);
		contentPane.add(btn_changeDataBase_01);
		
		JButton btn_changeDataBase_02 = new JButton("empleados");
		btn_changeDataBase_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					clearScreen();
					Main.mDB.changeDataBase("empleados.db");
					Main.vp.setTitle("empleados");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_changeDataBase_02.setBounds(219, 11, 65, 23);
		contentPane.add(btn_changeDataBase_02);
	
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private void clearScreen() {
		try {
			lbl_screen.setText("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

