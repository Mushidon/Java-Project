package br.edu.ifba.ads.trab.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
import br.edu.ifba.ads.trab.sessao.AppProjeto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Frame3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	
	private int lat2;
	private int long2;
	private String mat;
	
	public Frame3(VeiculoAutonomo autonomo,Coordenadas cordDest) {
		
		
		setTitle("Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVocAceita = new JLabel("Voc\u00EA aceita?");
		lblVocAceita.setBounds(138, 22, 104, 14);
		contentPane.add(lblVocAceita);
		
		JButton btnSim = new JButton("Sim");
		btnSim.setBounds(97, 58, 58, 23);
		contentPane.add(btnSim);
		
		JButton btnNo = new JButton("Nao");
		btnNo.setBounds(201, 58, 58, 23);
		contentPane.add(btnNo);
	
		

		btnSim.addActionListener(new ActionListener() {
			   
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					
					lat2 = cordDest.getLatitude();
					long2 = cordDest.getLongitude();
					mat = autonomo.getMatricula();
					
                    this.atualizar(new Coordenadas(lat2, long2), mat);
					JOptionPane.showMessageDialog(null, "Solicitacao aceita com sucesso!");	
					System.exit(DISPOSE_ON_CLOSE);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				} 
				

			}
			
			public void atualizar(Coordenadas pDest, String matricula) throws ClassNotFoundException, SQLException {
				
				try {
					AppProjeto projeto = new AppProjeto();
					projeto.atualizarCoordenadas(pDest, matricula);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}
			
			
		});
		
		btnNo.addActionListener(new ActionListener() {
			   
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(DISPOSE_ON_CLOSE);

			}
		});
	}

}
