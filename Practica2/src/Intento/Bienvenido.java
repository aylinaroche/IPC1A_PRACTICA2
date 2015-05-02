package Intento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Checkbox;
import java.awt.Button;

public class Bienvenido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido frame = new Bienvenido();
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
	public Bienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidos = DefaultComponentFactory.getInstance().createLabel("BIENVENIDOS");
		lblBienvenidos.setForeground(new Color(0, 153, 255));
		lblBienvenidos.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblBienvenidos.setBounds(194, 11, 146, 51);
		contentPane.add(lblBienvenidos);
		
		JLabel lblTorresDeHanoi = DefaultComponentFactory.getInstance().createTitle("TORRES DE HANOI");
		lblTorresDeHanoi.setForeground(new Color(128, 0, 0));
		lblTorresDeHanoi.setFont(new Font("Snap ITC", Font.PLAIN, 27));
		lblTorresDeHanoi.setBounds(116, 54, 316, 51);
		contentPane.add(lblTorresDeHanoi);
		
		JLabel lblInstrucciones = DefaultComponentFactory.getInstance().createLabel("INSTRUCCIONES:");
		lblInstrucciones.setForeground(new Color(75, 0, 130));
		lblInstrucciones.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		lblInstrucciones.setBounds(29, 116, 156, 14);
		contentPane.add(lblInstrucciones);
		
		JTextPane txtpnPonAPrueba = new JTextPane();
		txtpnPonAPrueba.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtpnPonAPrueba.setText("\u00A1Pon a prueba tu inteligencia!   El juego de la torre de Hanoi consiste en ir cambiando los discos de la torre A a la torre C con la condici\u00F3n de que no se puede mover m\u00E1s de un disco a la vez, y que no puede colocarse un disco grande sobre uno peque\u00F1o. \u00A1TU PUEDES!");
		txtpnPonAPrueba.setBounds(10, 141, 483, 82);
		contentPane.add(txtpnPonAPrueba);
		
		JLabel lblSeleccionaLaCantidad = DefaultComponentFactory.getInstance().createLabel("Selecciona la cantidad de aros");
		lblSeleccionaLaCantidad.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblSeleccionaLaCantidad.setBounds(20, 238, 296, 17);
		contentPane.add(lblSeleccionaLaCantidad);
		
		Checkbox checkbox = new Checkbox("3");
		checkbox.setBounds(38, 276, 38, 22);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("4");
		checkbox_1.setBounds(124, 276, 38, 22);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("5");
		checkbox_2.setBounds(194, 276, 53, 22);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("6");
		checkbox_3.setBounds(276, 276, 53, 22);
		contentPane.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("7");
		checkbox_4.setBounds(356, 276, 38, 22);
		contentPane.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("8");
		checkbox_5.setBounds(428, 276, 53, 22);
		contentPane.add(checkbox_5);
		
		Button button = new Button("INICIAR");
		button.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		button.setBounds(140, 332, 107, 33);
		contentPane.add(button);
		
		Button button_1 = new Button("SALIR");
		button_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		button_1.setBounds(253, 332, 101, 32);
		contentPane.add(button_1);
	}
}
