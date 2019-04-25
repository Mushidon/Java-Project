package br.edu.ifba.ads.trab.entidades;

public class VeiculoTerrestre extends VeiculoAutonomo {
	private static final double fixo = 30;

    public VeiculoTerrestre(String matricula, double capacidade, Coordenadas orig) {

        super(matricula, capacidade, orig);

    }

    protected double calculateDistance(Coordenadas pontoOrig, Coordenadas pontoDest) {

        double distancia = this.getOrigem().calculateDistanciaManhattan(pontoOrig, pontoDest);

        return distancia;

    }

    public double calculateCusto(Coordenadas pontoOrig, Coordenadas pontoDest, double peso) {
        double distancia = calculateDistance(pontoOrig, pontoDest);
        double custo = distancia * peso;

        if (custo < fixo) 
            return fixo;
       
       return custo;
    
    }

}

