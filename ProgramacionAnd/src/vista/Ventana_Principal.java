package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import controlador.ManejaDb;
import main.Main;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
import java.io.File;

import javax.swing.JMenuBar;
import java.awt.Choice;
import javax.swing.JScrollPane;

public class Ventana_Principal extends JFrame {

	private JLabel lbl_screen;
	private JPanel contentPane;
	JScrollPane scrollPanel_screen;
	private JButton btn_borrarTabla;
	

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
				}
				lbl_screen.setText("<html><body>" + tablasPrint + "</body></html>");
			}
		});
		btn_mostrarTablas.setBounds(10, 159, 183, 23);
		contentPane.add(btn_mostrarTablas);
		
		JButton btn_createTable = new JButton("Crear tabla");
		btn_createTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Main.vct.setVisible(true);
					clearScreen();
			}
		});
		btn_createTable.setBounds(10, 193, 183, 23);
		contentPane.add(btn_createTable);
		
		JButton btn_changeDataBase = new JButton("Cambiar Base de Datos");
		btn_changeDataBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser(new File("D:\\sqlite"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Bases de datos", "db", ".db");
				jf.setFileFilter(filter);
				jf.showOpenDialog(Main.vp);
				File file = jf.getSelectedFile();
				try {
					Main.mDB.changeDataBase(file.getName());
				} catch (NullPointerException | SQLException e1) {
					System.out.println("No se ha podido abrir la base de datos seleccionada.");
				}
			}
		});
		btn_changeDataBase.setBounds(241, 159, 183, 23);
		contentPane.add(btn_changeDataBase);
		
		scrollPanel_screen = new JScrollPane();
		scrollPanel_screen.setBounds(10, 11, 414, 137);
		contentPane.add(scrollPanel_screen);
		
		lbl_screen = new JLabel("");
		scrollPanel_screen.setViewportView(lbl_screen);
		lbl_screen.setVerticalAlignment(SwingConstants.TOP);
		lbl_screen.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_screen.setBackground(Color.WHITE);
		lbl_screen.setOpaque(true);
		
		btn_borrarTabla = new JButton("Borrar Tabla");
		btn_borrarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_borrarTabla.setBounds(10, 227, 183, 23);
		contentPane.add(btn_borrarTabla);
		
		
	
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
	
	public void printText(String text) {
		lbl_screen.setText(text);
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

