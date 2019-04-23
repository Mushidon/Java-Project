package br.edu.ifba.ads.trab.entidades;

public class VeiculoTerrestre extends VeiculoAutonomo {
	private static final double fixo = 30;

    public VeiculoTerrestre(String matricula, double capacidade, Coordenadas orig) {

        super(matricula, capacidade, orig);

    }

    protected double calculateDistance(Coordenadas pontoDest) {

        double distancia = pontoDest.calculateDistanciaManhattan(this.getOrigem());

        return distancia;

    }

    public double calculateCusto(Coordenadas pontoDest, double peso) {
        double distancia = calculateDistance(pontoDest);
        double custo = distancia * peso;

        if (custo < fixo) 
            return fixo;
       
       return custo;
    
    }

}

