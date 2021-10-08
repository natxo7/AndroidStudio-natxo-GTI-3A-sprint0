package com.example.natgarse_upv.android.LogicaFake;

import android.util.Log;
import android.view.View;

public class logica {
    public void boto(Medicion medicion) {
        Log.d("clienterestandroid", "boton_enviar_pulsado");


        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();

		/*

		   enviarPeticion( "hola", function (res) {
		   		res
		   })

        elPeticionario.hacerPeticionREST("GET",  "http://158.42.144.126:8080/prueba", null,
			(int codigo, String cuerpo) => { } );

		   */
        //la contrabarra es pa clavar la cometa dins del string sense tancar el stringç
        //http://localhost/phpmyadmin/sql.php?db=android_mysql&table=datosmedidos&pos=0
        String textoJSON = "{\"Medicion\":\"" + medicion.getMedicion() + "\", \"Latitud\":\"" + medicion.getLatitud() + " \", \"Longitud\":\"" + medicion.getLongitud() + "\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.0.113/ProyecteMediambientS0/insertar.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("" ,"Se ha insertado correctamente");
                    }
                }
        );
    }
}
