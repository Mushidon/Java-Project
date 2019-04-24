package br.edu.ifba.ads.trab.UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifba.ads.trab.UI.Frame2;
import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
import br.edu.ifba.ads.trab.sessao.AppProjeto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private String str3;
	private String str4;
	private String str5;
	private int lat2;
	private int long2;
	private double cap;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		
	  try {
		  
		setTitle("Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
						
		JLabel lblPontoDeColeta = new JLabel("Ponto de coleta");
		lblPontoDeColeta.setBounds(10, 11, 102, 14);
		contentPane.add(lblPontoDeColeta);
		
		JLabel lblNewLabel = new JLabel("Latitude");
		lblNewLabel.setBounds(10, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLongitude = new JLabel("Longitude");
		lblLongitude.setBounds(189, 29, 57, 14);
		contentPane.add(lblLongitude);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(256, 26, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblPontoDeEntreaa = new JLabel("Ponto de entrega");
		lblPontoDeEntreaa.setBounds(10, 67, 102, 14);
		contentPane.add(lblPontoDeEntreaa);
		
		JLabel label_1 = new JLabel("Latitude");
		label_1.setBounds(10, 85, 46, 14);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(107, 125, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Longitude");
		label_2.setBounds(189, 85, 57, 14);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(256, 82, 86, 20);
		contentPane.add(textField_3);

		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(157, 203, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("Capacidade(Kg)");
		lblNewLabel_1.setBounds(10, 128, 102, 14);
		contentPane.add(lblNewLabel_1);

		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(66, 82, 86, 20);
		contentPane.add(textField_4);
		
		btnBuscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				
				str3 = 	textField_2.getText();
				str4 = 	textField_3.getText();
				str5 = 	textField_4.getText();
				cap = Double.parseDouble(str3);
				long2 = Integer.parseInt(str4);
				lat2 = Integer.parseInt(str5);
				
				//lat2 = Integer.parseInt(str3);
				//long2 = Integer.parseInt(str4);
				//cap = Double.parseDouble(str5);
				try {
					this.buscar(lat2, long2, cap);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			

			public void buscar(int lat2, int long2, double peso) throws Exception {
				
				 AppProjeto projeto = new AppProjeto();
			     VeiculoAutonomo autonomo = projeto.calculateMenorCusto(new Coordenadas(lat2, long2), peso);
			     Coordenadas cord = new Coordenadas(lat2,long2);
			    if(autonomo != null) { 
			     Frame2 janela2 = new Frame2(autonomo,cord,cap);
			     janela2.setVisible(true);
			     
			   }
			   
			   else {
				   
				  
				   
			   }
						
				
				
			}
			
			
			
			
			
		});
		
		
		
	  }catch(Exception e){
		  
		  e.printStackTrace();
		  
	  }
	
	  
	}
		
	
}
