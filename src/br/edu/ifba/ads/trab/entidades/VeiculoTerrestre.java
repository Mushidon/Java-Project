package br.edu.ifba.ads.trab.entidades;

public class VeiculoTerrestre extends VeiculoAutonomo {
	private static final double fixo = 30;

    public VeiculoTerrestre(String matricula, int capacidade, Coordenadas orig) {

        super(matricula, capacidade, orig);

    }

    protected int calculateDistance(Coordenadas pontoDest) {

        int distancia = pontoDest.calculateDistanciaManhattan(pontoDest);

        return distancia;

    }

    public double calculateCusto(Coordenadas pontoDest, double peso) {
        double distancia = calculateDistance(pontoDest);
        double custo = (1 * peso) * distancia;

        if (custo < fixo) {
            return fixo;
        } else {
            return custo;
        }
    }

}

