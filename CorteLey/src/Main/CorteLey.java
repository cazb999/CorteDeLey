package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class CorteLey extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtContratoPartUno;
	private JTextField txtContratoPartDos;
	private JTextField txtCuotaUno;
	private JTextField txtCuotaDos;
	private JTextField txtCuotaFraccionada;
	private JTextField txtPrk1;
	private JTextField txtPrk2;
	private JTextField txtPri1;
	private JTextField txtPri2;
	private JCheckBox cbxFraccionada;
	private JLabel lblCuotasFraccionada;
	private JLabel lblPrk;
	private JLabel lblPri;
	private JTextPane txtResultado;
	private JButton btnOk;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorteLey frame = new CorteLey();
					frame.setResizable(false);
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
	public CorteLey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
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
		
		JLabel lblFraccionada = new JLabel("Fraccionada?");
		lblFraccionada.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblFraccionada.setBounds(479, 61, 134, 29);
		contentPane.add(lblFraccionada);
		
		cbxFraccionada = new JCheckBox("Fraccionada");
		cbxFraccionada.setBackground(Color.WHITE);
		cbxFraccionada.setFont(new Font("Arial", Font.PLAIN, 16));
		cbxFraccionada.setBounds(479, 91, 134, 25);
		contentPane.add(cbxFraccionada);
		
		lblCuotasFraccionada = new JLabel("Cuota fraccionada");
		lblCuotasFraccionada.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblCuotasFraccionada.setBounds(25, 168, 179, 29);
		lblCuotasFraccionada.setVisible(false);
		contentPane.add(lblCuotasFraccionada);
		
		txtCuotaFraccionada = new JTextField();
		txtCuotaFraccionada.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCuotaFraccionada.setColumns(10);
		txtCuotaFraccionada.setVisible(false);
		txtCuotaFraccionada.setBounds(73, 195, 41, 26);
		
		contentPane.add(txtCuotaFraccionada);
		
		lblPrk = new JLabel("PRK");
		lblPrk.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPrk.setBounds(270, 148, 44, 29);
		lblPrk.setVisible(false);
		contentPane.add(lblPrk);
		
		lblPri = new JLabel("PRI");
		lblPri.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPri.setBounds(431, 148, 44, 29);
		lblPri.setVisible(false);
		contentPane.add(lblPri);
		
		txtPrk1 = new JTextField();
		txtPrk1.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPrk1.setColumns(10);
		txtPrk1.setBounds(327, 152, 41, 26);
		txtPrk1.setVisible(false);
		contentPane.add(txtPrk1);
		
		txtPrk2 = new JTextField();
		txtPrk2.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPrk2.setColumns(10);
		txtPrk2.setBounds(327, 191, 41, 26);
		txtPrk2.setVisible(false);
		contentPane.add(txtPrk2);
		
		txtPri1 = new JTextField();
		txtPri1.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPri1.setColumns(10);
		txtPri1.setBounds(479, 152, 41, 26);
		txtPri1.setVisible(false);
		contentPane.add(txtPri1);
		
		txtPri2 = new JTextField();
		txtPri2.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPri2.setColumns(10);
		txtPri2.setBounds(479, 193, 41, 26);
		txtPri2.setVisible(false);
		contentPane.add(txtPri2);
		
		txtResultado = new JTextPane();
		txtResultado.setBackground(Color.LIGHT_GRAY);
		txtResultado.setBounds(24, 245, 639, 195);
		contentPane.add(txtResultado);
		
		JLabel label = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(15, 129, 655, 16);
		contentPane.add(label);
		
		btnOk = new JButton("ok");
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setFont(new Font("Arial Black", Font.BOLD, 26));
		btnOk.setBounds(557, 148, 97, 73);
		contentPane.add(btnOk);
		
		this.cbxFraccionada.addActionListener(this);
		this.btnOk.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.cbxFraccionada) {
			if(!this.cbxFraccionada.isSelected()) {
				this.lblCuotasFraccionada.setVisible(false);
				this.lblPri.setVisible(false);
				this.lblPrk.setVisible(false);
				this.txtCuotaFraccionada.setVisible(false);
				this.txtPri1.setVisible(false);
				this.txtPri2.setVisible(false);
				this.txtPrk1.setVisible(false);
				this.txtPrk2.setVisible(false);
			}else if(this.cbxFraccionada.isSelected()) {
				this.lblCuotasFraccionada.setVisible(true);
				this.lblPri.setVisible(true);
				this.lblPrk.setVisible(true);
				this.txtCuotaFraccionada.setVisible(true);
				this.txtPri1.setVisible(true);
				this.txtPri2.setVisible(true);
				this.txtPrk1.setVisible(true);
				this.txtPrk2.setVisible(true);
			}
			
		}
		
		if(e.getSource() == this.btnOk) {
			this.txtResultado.setText("Aqui va el resultado");
		}
		
	}
}
