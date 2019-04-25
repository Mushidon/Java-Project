package br.edu.ifba.ads.trab.sessao;


import java.sql.SQLException;

import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;

public interface AppProjetoIF {
	public VeiculoAutonomo calculateMenorCusto(Coordenadas pontoOrig, Coordenadas pontoDest, double peso) throws Exception;
	public void atualizarCoordenadas (Coordenadas pontoDest, String matricula) throws Exception;
	public double getMenorCusto (Coordenadas pontoOrig, Coordenadas pontoDest, double peso) throws SQLException, Exception;
	public String getMatriculaMenor (Coordenadas pontoOrig, Coordenadas pontoDest, double peso) throws SQLException, Exception;
	    	
	
}