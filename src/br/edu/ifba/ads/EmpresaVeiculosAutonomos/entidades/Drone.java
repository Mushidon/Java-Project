package br.edu.ifba.ads.trab.entidades;

public class Drone extends VeiculoAutonomo {
	   private static final double fixo = 40;
	   
	   public Drone(String matricula, int capacidade, Coordenadas orig) {

	        super(matricula, capacidade, orig);

	    }

	    protected int calculateDistance(Coordenadas pontoDest) {
	        
	    	return (int)pontoDest.calculateDistanciaEuclidiana(pontoDest);
	    }

	    public double calculateCusto(Coordenadas pontoDest, double peso) {
	        double distancia = calculateDistance(pontoDest);
	        double custo = (1.25 * peso ) * distancia;

	        if (custo < fixo) {
	            return fixo;
	        } else {
	            return custo;
	        }
	    }

	}

