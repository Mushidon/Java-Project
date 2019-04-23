package br.edu.ifba.ads.trab.sessao;

import java.util.Collection;
import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;

public interface AppProjetoIF {
	public VeiculoAutonomo calculateMenorCusto(Coordenadas pontoDest, double peso) throws Exception;
	public void atualizarCoordenadas (Coordenadas pontoDest, String matricula) throws Exception;
}