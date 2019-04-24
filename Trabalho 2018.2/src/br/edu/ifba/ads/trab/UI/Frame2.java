package br.edu.ifba.ads.trab.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifba.ads.trab.UI.Frame3;
import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;


public class Frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @param cord 
	 * @param cap 
	 */
	
	
	public Frame2(VeiculoAutonomo autonomo, Coordenadas cord, double cap) {
		
		setTitle("Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdveculo = new JLabel("Matricula(Ve\u00EDculo):");
		lblIdveculo.setBounds(10, 25, 117, 24);
		contentPane.add(lblIdveculo);
		
		JLabel lblCapacidadekg = new JLabel("Custo(R$):");
		lblCapacidadekg.setBounds(10, 60, 100, 24);
		contentPane.add(lblCapacidadekg);
		
		JButton btnAceitar = new JButton("Aceitar");
		btnAceitar.setBounds(158, 103, 89, 23);
		contentPane.add(btnAceitar);
		
		JLabel lblNewLabel = new JLabel("New label1");
		lblNewLabel.setBounds(154, 30, 185, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(""+autonomo.getMatricula());
		
		
		JLabel lblNewLabel_1 = new JLabel("New label2");
		lblNewLabel_1.setBounds(139, 65, 185, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(""+autonomo.calculateCusto(cord, cap));
		

		
		btnAceitar.addActionListener(new ActionListener() {
			   
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Frame3 janela3 = new Frame3(autonomo,cord);
				janela3.setVisible(true);
				
	
			}
		});
		
	}

	
	
}
