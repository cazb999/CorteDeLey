package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CorteDeley extends JFrame {

	private JPanel contentPane;
	private JTextField txtContratoPartUno;
	private JTextField txtContratoPartDos;
	private JTextField txtCuotaUno;
	private JTextField txtCuotaDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorteDeley frame = new CorteDeley();
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
	public CorteDeley() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Corte De Ley");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 25));
		lblTitulo.setBounds(15, 16, 648, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblContrato = new JLabel("Contrato");
		lblContrato.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblContrato.setBounds(25, 61, 89, 29);
		contentPane.add(lblContrato);
		
		txtContratoPartUno = new JTextField();
		txtContratoPartUno.setFont(new Font("Arial", Font.PLAIN, 16));
		txtContratoPartUno.setBounds(35, 90, 41, 26);
		contentPane.add(txtContratoPartUno);
		txtContratoPartUno.setColumns(10);
		
		txtContratoPartDos = new JTextField();
		txtContratoPartDos.setFont(new Font("Arial", Font.PLAIN, 16));
		txtContratoPartDos.setColumns(10);
		txtContratoPartDos.setBounds(91, 89, 91, 26);
		contentPane.add(txtContratoPartDos);
		
		JLabel lblCuotasSinFraccionar = new JLabel("Cuotas sin fraccionar");
		lblCuotasSinFraccionar.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblCuotasSinFraccionar.setBounds(237, 61, 201, 29);
		contentPane.add(lblCuotasSinFraccionar);
		
		JLabel lblDe = new JLabel("De");
		lblDe.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDe.setBounds(247, 93, 30, 29);
		contentPane.add(lblDe);
		
		txtCuotaUno = new JTextField();
		txtCuotaUno.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCuotaUno.setColumns(10);
		txtCuotaUno.setBounds(273, 90, 41, 26);
		contentPane.add(txtCuotaUno);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setFont(new Font("Arial", Font.PLAIN, 16));
		lblHasta.setBounds(327, 92, 44, 29);
		contentPane.add(lblHasta);
		
		txtCuotaDos = new JTextField();
		txtCuotaDos.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCuotaDos.setColumns(10);
		txtCuotaDos.setBounds(375, 90, 41, 26);
		contentPane.add(txtCuotaDos);
		
		JLabel label = new JLabel("Cuotas sin fraccionar");
		label.setFont(new Font("Arial Black", Font.PLAIN, 16));
		label.setBounds(462, 61, 201, 29);
		contentPane.add(label);
	}
}
