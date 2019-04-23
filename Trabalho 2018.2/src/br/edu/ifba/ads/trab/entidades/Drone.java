package br.edu.ifba.ads.trab.entidades;

public class Drone extends VeiculoAutonomo {
	   private static final double fixo = 40;
	   
	   public Drone(String matricula, double capacidade, Coordenadas orig) {

	        super(matricula, capacidade, orig);

	    }

	    protected double calculateDistance(Coordenadas pontoDest) {
	        
	    	return pontoDest.calculateDistanciaEuclidiana(this.getOrigem());
	    }

	    public double calculateCusto(Coordenadas pontoDest, double peso) {
	        double distancia = calculateDistance(pontoDest);
	        double custo =  distancia * (1.25) * (peso);

	        if (custo < fixo) 
	           return fixo;
	       
	        return custo;
	    }
	    

	}

