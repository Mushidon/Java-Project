package br.edu.ifba.ads.trab.persistencia;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;

	public interface AutonomoDAO {
		public void inserir(VeiculoAutonomo veiculo) throws Exception;
		public VeiculoAutonomo buscar() throws Exception;
		public ArrayList<VeiculoAutonomo> findVeiculosByPeso (double peso) throws Exception;
		public void updateCoordenadas (int latitude, int longitude, String matricula) throws Exception;	
		}

