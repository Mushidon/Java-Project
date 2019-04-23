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

    public double calculateDistanciaManhattan(Coordenadas pontoDest) {

        double numeroAbsX = Math.abs(this.getLatitude() - pontoDest.getLatitude());
        double numeroAbsY = Math.abs(this.getLongitude() - pontoDest.getLongitude());

        return numeroAbsX + numeroAbsY;

    }

    public double calculateDistanciaEuclidiana(Coordenadas pontoDest) {

        double potenciaX = Math.pow(this.getLatitude() - pontoDest.getLatitude(), 2);
        double potenciaY = Math.pow(this.getLongitude() - pontoDest.getLongitude(), 2);

        return Math.sqrt(potenciaX + potenciaY);

    }

}

