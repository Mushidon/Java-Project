package br.edu.ifba.ads.trab.entidades;

public abstract class VeiculoAutonomo {

	    private String matricula;
	    private double capacidade;
	    private Coordenadas origem;

	    public VeiculoAutonomo(String matricula, double capacidade, Coordenadas orig) {
	        this.setMatricula(matricula);
	        this.setCapacidade(capacidade);
	        this.origem = orig;
	    }
	    
	    protected abstract double calculateDistance(Coordenadas pontoDest);
	    public abstract double calculateCusto(Coordenadas pontoDest, double peso);
	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    public double getCapacidade() {
	        return capacidade;
	    }

	    public void setCapacidade(double capacidade) {
	        this.capacidade = capacidade;
	    }
	    
	    public Coordenadas getOrigem () {
	    	return this.origem;
	    }

}
