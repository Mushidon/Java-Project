package br.edu.ifba.ads.trab.entidades;

public class Drone extends VeiculoAutonomo {
	   private static final double fixo = 40;
	   
	   public Drone(String matricula, double capacidade, Coordenadas orig) {

	        super(matricula, capacidade, orig);

	    }

	    protected double calculateDistance(Coordenadas pontoOrig, Coordenadas pontoDest) {
	        
	    	return this.getOrigem().calculateDistanciaEuclidiana(pontoOrig,pontoDest);
	    }

	    public double calculateCusto(Coordenadas pontoOrig, Coordenadas pontoDest, double peso) {
	        double distancia = calculateDistance(pontoOrig, pontoDest);
	        double custo =  distancia * (1.25) * (peso);

	        if (custo < fixo) 
	           return fixo;
	       
	        return custo;
	    }



	}

