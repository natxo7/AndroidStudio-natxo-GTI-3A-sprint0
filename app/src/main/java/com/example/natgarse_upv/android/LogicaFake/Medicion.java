package com.example.natgarse_upv.android.LogicaFake;

public class Medicion {
    private int medicion;
    public double latitud;
    public double longitud;

    public Medicion(int medicion, double latitud, double longitud) {
        this.medicion = medicion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getMedicion() {
        return medicion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
}
