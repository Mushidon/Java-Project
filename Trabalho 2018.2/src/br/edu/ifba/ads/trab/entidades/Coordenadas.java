package br.edu.ifba.ads.trab.entidades;

public class Coordenadas {
	
	private int latitude;
    private int longitude;

    public Coordenadas(int latitude, int longitude) {
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    //calculo da distância dos veiculos terrestres//
    public double calculateDistanciaManhattan(Coordenadas pontoOrig, Coordenadas pontoDest) {

        double numeroAbsX = Math.abs(this.getLatitude() - pontoDest.getLatitude() +  Math.abs(this.getLongitude() - pontoDest.getLongitude()));
        double numeroAbsY = Math.abs( pontoOrig.getLatitude() - pontoDest.getLatitude() + Math.abs(pontoOrig.getLongitude() - pontoDest.getLongitude()));
       
        
        return numeroAbsX + numeroAbsY;

    }
    
    //calculo da distância dos veiculos aereos//
    public double calculateDistanciaEuclidiana(Coordenadas pontoOrig, Coordenadas pontoDest) {

        double potenciaX = Math.pow(this.getLatitude() - pontoDest.getLatitude(), 2) + Math.pow(this.getLongitude() - pontoDest.getLongitude(), 2);
        double potenciaY = Math.pow(pontoOrig.getLatitude()- pontoDest.getLatitude(), 2) + Math.pow(pontoOrig.getLongitude() - pontoDest.getLongitude(), 2);

        return Math.sqrt(potenciaX + potenciaY);

    }

}

