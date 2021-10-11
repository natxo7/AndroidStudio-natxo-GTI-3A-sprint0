package com.example.natgarse_upv.android.LogicaFake;

import android.util.Log;
import android.view.View;

public class logica {
    public void boto(Medicion medicion) {
        PeticionarioREST elPeticionario = new PeticionarioREST();

        //la contrabarra es pa clavar la cometa dins del string sense tancar el stringç
        //http://localhost/phpmyadmin/sql.php?db=android_mysql&table=datosmedidos&pos=0
        //{\"Medicion\": \"+medicion.getMedicion()\", \"nombre\": \"Android\", \"apellidos\": \"De Los Palotes\"}
           // String textoJSON = "{\"Medicion\":\""+medicion.getMedicion()+"\", \"Longitud\":\""+medicion.getLongitud() +"\", \"Latitud\": \""+medicion.getLatitud()+"\"}";

        String textoJSON = "{\"Medicion\":"+medicion.getMedicion()+", \"Longitud\":"+medicion.getLongitud()+", \"Latitud\":"+medicion.getLatitud()+"}";
       // String textoJSON = "{\"Medicion\":\""+medicion.getMedicion()+ "\", \"Latitud\":\"" +medicion.getLatitud() +"\", \"Longitud\":\"" + medicion.getLongitud() + "\"}";
        elPeticionario.hacerPeticionREST("GET", "http://192.168.0.129/backend-natxo-GTI-3A-sprint0/insertar.php?Medicion=12&Latitud=13&Longitud=14",null,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("", "Se ha insertado correctamente");
                    }
                }
        );
        System.out.println("----------"+textoJSON);



    }
}

