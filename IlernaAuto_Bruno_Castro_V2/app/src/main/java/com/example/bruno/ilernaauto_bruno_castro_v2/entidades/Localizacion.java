package com.example.bruno.ilernaauto_bruno_castro_v2.entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Localizacion {

    private String direccion;
    private double latitud;
    private double longitud;
    private List<Localizacion> puntos;
    private DatabaseReference db;
    public Localizacion() {
    }

    public Localizacion(String direccion, double latitud, double longitud) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }


    public void puntosUsuario (Localizacion l){

        db = FirebaseDatabase.getInstance().getReference().child("localizaciones");
        db.push().setValue(l);

    }

}
