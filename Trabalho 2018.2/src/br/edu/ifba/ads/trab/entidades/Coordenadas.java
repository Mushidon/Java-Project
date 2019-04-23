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

    public int calculateDistanciaManhattan(Coordenadas pontoDest) {

        int numeroAbsX = Math.abs(this.getLatitude() - pontoDest.getLatitude());
        int numeroAbsY = Math.abs(this.getLongitude() - pontoDest.getLongitude());

        return numeroAbsX + numeroAbsY;

    }

    public int calculateDistanciaEuclidiana(Coordenadas pontoDest) {

        double potenciaX = Math.pow(this.getLatitude() - pontoDest.getLatitude(), 2);
        double potenciaY = Math.pow(this.getLongitude() - pontoDest.getLongitude(), 2);

        return (int)Math.sqrt(potenciaX + potenciaY);

    }

}

