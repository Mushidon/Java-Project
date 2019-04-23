package br.edu.ifba.ads.trab.sessao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
import br.edu.ifba.ads.trab.persistencia.AutonomoDAO;
import br.edu.ifba.ads.trab.persistencia.AutonomoSQLDAO;


public class AppProjeto implements AppProjetoIF {
	    
	    
    private AutonomoDAO autonomoDAO;
	
	public AppProjeto() throws ClassNotFoundException, IOException, SQLException {
		this.autonomoDAO = new AutonomoSQLDAO();
	}

    
	public VeiculoAutonomo calculateMenorCusto (Coordenadas pontoDest, double peso) throws SQLException, Exception {
	
	ArrayList<VeiculoAutonomo> veiculos = new ArrayList<VeiculoAutonomo>();
	veiculos = this.autonomoDAO.findVeiculosByPeso(peso); 
	VeiculoAutonomo menor = veiculos.get(0);
		for(int iCont=0; iCont<veiculos.size(); iCont++) {
			if(veiculos.get(iCont).calculateCusto(pontoDest, peso) < menor.calculateCusto(pontoDest, peso)) 
					menor = veiculos.get(iCont);
		}
	
	return menor;
		
		
		
	
	}
	
	public String getMatriculaMenor (VeiculoAutonomo veiculo, double peso) throws SQLException, Exception {
		veiculo = this.calculateMenorCusto(veiculo.getOrigem(), peso);
				return veiculo.getMatricula();
	}
	
	public double getMenorCapacidade (VeiculoAutonomo veiculo, double peso) throws SQLException, Exception {
		veiculo = this.calculateMenorCusto(veiculo.getOrigem(), peso);
				return veiculo.getCapacidade();
	}
	
	
    public void atualizarCoordenadas (Coordenadas pontoDest, String matricula) throws Exception {
    	this.autonomoDAO.updateCoordenadas(pontoDest.getLatitude(), pontoDest.getLongitude(), matricula);
    }
    
}
