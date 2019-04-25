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

    //Retorna o veiculo que possuo o menor custo dentre os veiculos da lista// 
	
	public VeiculoAutonomo calculateMenorCusto (Coordenadas pontoOrig, Coordenadas pontoDest,  double peso) throws SQLException, Exception {
	
	ArrayList<VeiculoAutonomo> veiculos = new ArrayList<VeiculoAutonomo>();
	veiculos = this.autonomoDAO.findVeiculosByPeso(peso); 
	VeiculoAutonomo menor = veiculos.get(0);
		for(int iCont=0; iCont<veiculos.size(); iCont++) {
			if(veiculos.get(iCont).calculateCusto(pontoOrig, pontoDest, peso) < menor.calculateCusto(pontoOrig, pontoDest, peso)) 
					menor = veiculos.get(iCont);
		}
	
				return menor;
		
		
		
	
	}
	
	//Retorna a matricula do veiculo com o menor custo dentre os veiculos da lista//
	
	public String getMatriculaMenor (Coordenadas pontoOrig, Coordenadas pontoDest, double peso) throws SQLException, Exception {
		VeiculoAutonomo veiculo = this.calculateMenorCusto(pontoOrig, pontoDest, peso);
				return veiculo.getMatricula();
	}
	
	//Retorna o custo do veiculo com o menor custo dentre os veiculos da lista//
	
	public double getMenorCusto (Coordenadas pontoOrig,Coordenadas pontoDest, double peso) throws SQLException, Exception {
		VeiculoAutonomo veiculo = this.calculateMenorCusto(pontoOrig,pontoDest, peso);
				return veiculo.calculateCusto(pontoOrig,pontoDest, peso);
	}
	
	//Atualiza as coordenadas do veiculo cuja a matricula foi passada no banco de dados//
	
    public void atualizarCoordenadas (Coordenadas pontoDest, String matricula) throws Exception {
    	this.autonomoDAO.updateCoordenadas(pontoDest.getLatitude(), pontoDest.getLongitude(), matricula);
    }
    
}
