package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import semana_05.ArregloPrecios;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_5_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_5_2 frame = new Propuesto_5_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_5_2() {
		setTitle("Propuesto_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(120, 11, 95, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(220, 11, 95, 23);
		contentPane.add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	ArregloPrecios ap = new ArregloPrecios();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		
		imprimir();    	
    	imprimir("Tama�o total del arreglo :  " + ap.tamanio());    	
    	imprimir("Promedio :  " + ap.precioPromedio());
    	imprimir("precio mayor :  " + ap.precioMayor());
    	imprimir("precio menor :  " + ap.precioMenor());
    	imprimir("Precio mayores al promedio  :  " + ap.cantMayoresPrecioPromedio());
    	imprimir("Precio menores al promedio :  " + ap.cantMenoresPrecioPromedio());
    	imprimir("Primer precio mayor al segundo  :  " + ap.posPrimerPrecioMayorAlSegundo(serialVersionUID, serialVersionUID));
    	imprimir("Ultimo precio menor al penultimo:  " + ap.posUltimoPrecioMenorAlPenultimo());

	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		ap.generarPrecio();
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}