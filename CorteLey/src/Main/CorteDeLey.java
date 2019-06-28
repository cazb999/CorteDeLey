package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
import javax.swing.JScrollPane;

public class CorteDeLey extends JFrame implements ActionListener{

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
	private JTextArea txtResultado;
	private JButton btnOk;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorteDeLey frame = new CorteDeLey();
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
	public CorteDeLey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 800);
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
		txtPrk1.setBounds(327, 152, 89, 26);
		txtPrk1.setVisible(false);
		contentPane.add(txtPrk1);
		
		txtPrk2 = new JTextField();
		txtPrk2.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPrk2.setColumns(10);
		txtPrk2.setBounds(327, 191, 89, 26);
		txtPrk2.setVisible(false);
		contentPane.add(txtPrk2);
		
		txtPri1 = new JTextField();
		txtPri1.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPri1.setColumns(10);
		txtPri1.setBounds(468, 150, 83, 26);
		txtPri1.setVisible(false);
		contentPane.add(txtPri1);
		
		txtPri2 = new JTextField();
		txtPri2.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPri2.setColumns(10);
		txtPri2.setBounds(468, 195, 83, 26);
		txtPri2.setVisible(false);
		contentPane.add(txtPri2);
		
		JLabel label = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(15, 129, 655, 16);
		contentPane.add(label);
		
		btnOk = new JButton("ok");
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setFont(new Font("Arial Black", Font.BOLD, 26));
		btnOk.setBounds(557, 148, 97, 73);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 231, 663, 513);
		contentPane.add(scrollPane);
		
		txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		txtResultado.setBackground(Color.LIGHT_GRAY);
		
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
			int cuotaInicio = Integer.parseInt(this.txtCuotaUno.getText());
			int cuotaFin = Integer.parseInt(this.txtCuotaDos.getText());
			String cuotas = "(";
			for (int i = cuotaInicio; i <= cuotaFin; i++) {
				if(i == cuotaFin) {
					cuotas += ""+i;
				}else {
					cuotas += ""+i+", ";
				}
				
			}
			cuotas += ")";
			
			this.txtResultado.setText("");
			this.txtResultado.append("UPDATE cfcprd/prktbl SET PRKEST = 10\n");
			this.txtResultado.append("WHERE srvcdg="+this.txtContratoPartUno.getText()+" AND srvcns="+this.txtContratoPartDos.getText()+" AND prkcta IN "+cuotas+"\n");
			this.txtResultado.append("AND PRKEST = 0\n");
			this.txtResultado.append("\n");
			
			this.txtResultado.append("UPDATE cfcprd/pritbl SET PRIEST = 10\n");
			this.txtResultado.append("WHERE srvcdg="+this.txtContratoPartUno.getText()+" AND srvcns="+this.txtContratoPartDos.getText()+" AND pricta IN "+cuotas+"\n");
			this.txtResultado.append("AND PRIEST = 0\n");
			this.txtResultado.append("\n");
			
			this.txtResultado.append("UPDATE cfcprd/prutbl SET PRUEST = 10\n");
			this.txtResultado.append("WHERE srvcdg="+this.txtContratoPartUno.getText()+" AND srvcns="+this.txtContratoPartDos.getText()+" AND pructa IN "+cuotas+"\n");
			this.txtResultado.append("AND PRUEST = 0\n");
			this.txtResultado.append("\n");
			
			if(this.cbxFraccionada.isSelected()) {
				this.txtResultado.append("-- PRK FRACCIONADA\n");
				this.txtResultado.append("UPDATE CFCPRD/PRKTBL SET PRKEST = 2\n");
				this.txtResultado.append("WHERE SRVCDG = "+this.txtContratoPartUno.getText()+" AND SRVCNS = "+this.txtContratoPartDos.getText()+" AND PRKEST = 0\n");
				this.txtResultado.append("AND PRKCTA = "+this.txtCuotaFraccionada.getText()+" AND PRKFRC = 0\n");
				this.txtResultado.append("\n");
				
				this.txtResultado.append("INSERT INTO CFCPRD/PRKTBL\n");
				this.txtResultado.append("SELECT SRVCDG, SRVCNS, PRKCTA, 1, PRKFPA, PRKFPM, PRKFPD,\n");
				this.txtResultado.append("PRKFHA, PRKFHM, PRKFHD, PRKFAA, PRKFAM, PRKFAD,  "+this.txtPrk1.getText()+", PRKVLP,\n");
				this.txtResultado.append("PRKSPG, PRKSLD, PRKTPG, 10 FROM CFCPRD/PRKTBL WHERE SRVCDG="+this.txtContratoPartUno.getText()+" \n");
				this.txtResultado.append("AND SRVCNS="+this.txtContratoPartDos.getText()+" AND PRKCTA="+this.txtCuotaFraccionada.getText()+"\n");
				this.txtResultado.append("\n");
				
				this.txtResultado.append("INSERT INTO CFCPRD/PRKTBL\n");
				this.txtResultado.append("SELECT SRVCDG, SRVCNS, PRKCTA, 2, PRKFPA, PRKFPM, PRKFPD,\n");
				this.txtResultado.append("PRKFHA, PRKFHM, PRKFHD, PRKFAA, PRKFAM, PRKFAD, "+this.txtPrk2.getText()+", PRKVLP,\n");
				this.txtResultado.append("PRKSPG, PRKSLD, PRKTPG, 0 FROM CFCPRD/PRKTBL WHERE SRVCDG="+this.txtContratoPartUno.getText()+" \n");
				this.txtResultado.append("AND SRVCNS="+this.txtContratoPartDos.getText()+" AND PRKCTA="+this.txtCuotaFraccionada.getText()+" AND PRKFRC=0\n");
				this.txtResultado.append("\n");
				
				this.txtResultado.append("-- PRI FRACCIONADA\n");
				this.txtResultado.append("UPDATE CFCPRD/PRITBL SET PRIEST = 2\n");
				this.txtResultado.append("WHERE SRVCDG = "+this.txtCuotaFraccionada.getText()+" AND SRVCNS = "+this.txtContratoPartDos.getText()+" AND PRIEST = 0\n");
				this.txtResultado.append("AND PRICTA = "+this.txtCuotaFraccionada.getText()+" AND PRIFRC = 0\n");
				this.txtResultado.append("\n");
				
				this.txtResultado.append("INSERT INTO CFCPRD/PRITBL\n");
				this.txtResultado.append("SELECT SRVCDG, SRVCNS, PRICTA, 1, PRIFPA, PRIFPM, PRIFPD,\n");
				this.txtResultado.append("PRIFDA, PRIFDM, PRIFDD, PRIFHA, PRIFHM, PRIFHD, PRIFCA, PRIFCM,\n");
				this.txtResultado.append("PRIFCD, PRIFRA, PRIFRM, PRIFRD,  "+this.txtPri1.getText()+", PRIVLP, PRITSR, PRITPG,\n");
				this.txtResultado.append("10 FROM CFCPRD/PRITBL WHERE SRVCDG = "+this.txtContratoPartUno.getText()+" AND SRVCNS = "+this.txtContratoPartDos.getText()+"\n");
				this.txtResultado.append("AND PRICTA="+this.txtCuotaFraccionada.getText()+"\n");
				this.txtResultado.append("\n");
				
				this.txtResultado.append("INSERT INTO CFCPRD/PRITBL\n");
				this.txtResultado.append("SELECT SRVCDG, SRVCNS, PRICTA, 2, PRIFPA, PRIFPM, PRIFPD,\n");
				this.txtResultado.append("PRIFDA, PRIFDM, PRIFDD, PRIFHA, PRIFHM, PRIFHD, PRIFCA, PRIFCM,\n");
				this.txtResultado.append("PRIFCD, PRIFRA, PRIFRM, PRIFRD,  "+this.txtPri2.getText()+", PRIVLP, PRITSR, PRITPG,\n");
				this.txtResultado.append("0 FROM CFCPRD/PRITBL WHERE SRVCDG = "+this.txtContratoPartUno.getText()+" AND SRVCNS = "+this.txtContratoPartDos.getText()+"\n");
				this.txtResultado.append("AND PRICTA="+this.txtCuotaFraccionada.getText()+" AND PRIFRC=0\n");
				this.txtResultado.append("\n");
			}
		}
		
	}
}
