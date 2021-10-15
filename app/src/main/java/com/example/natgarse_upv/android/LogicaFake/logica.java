package com.example.natgarse_upv.android.LogicaFake;

import android.util.Log;
import android.view.View;

public class logica {
    public void boto(Medicion medicion) {
        PeticionarioREST elPeticionario = new PeticionarioREST();
        //delclaramos el String JSON
        String textoJSON = "{\"Medicion\":"+medicion.getMedicion()+", \"Longitud\":"+medicion.getLongitud()+", \"Latitud\":"+medicion.getLatitud()+"}";
      /*
      Parametros
      * Indicamos el metodo y la direccion de destino
      * Hay que modificar la IP
      * String
      * */
        elPeticionario.hacerPeticionREST("POST", "http://10.236.32.83/backend-natxo-GTI-3A-sprint0/insertar.php",textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        //Log de comprovación
                        Log.d("", "Se ha insertado correctamente");
                    }
                }
        );

    }
}

