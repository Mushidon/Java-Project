package br.edu.ifba.ads.trab.sessao;

import java.sql.SQLException;

import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;


public class Teste {

	public void run() throws Exception {
	AppProjeto teste = new AppProjeto(); 
	
	VeiculoAutonomo veiculo = teste.calculateMenorCusto(new Coordenadas(25,38), 60);
	System.out.println(veiculo.getMatricula());
	//teste.atualizarCoordenadas(new Coordenadas(100,222),veiculo.getMatricula());
	
	}
	
	
	public static void main(String[] args) throws Exception, SQLException, ClassNotFoundException {
		(new Teste()).run();
		System.out.println("Finalizando");
	}
	
}
