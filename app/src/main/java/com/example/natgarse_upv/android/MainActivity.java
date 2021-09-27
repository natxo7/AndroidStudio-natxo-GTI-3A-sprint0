package com.example.natgarse_upv.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;



public class MainActivity extends AppCompatActivity {
    EditText txtMediciones;
    Button btnInsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMediciones = findViewById(R.id.txtMediciones);
    }

    /* public void cliclkBtnInsertar(View view){
       String url="https://192.168.0.129/ProyecteMediambientS0/insertar.php";
      var queue:Volley.newRequestQueue(this);
      var resultadoPost=object:StringRequest(Request.Method.POST,url,
                 Response.Listener<String>{response->
                         Toast.makeText(this,"Datos insertados correctamente",Toast.LENGTH_LONG).show()
                 },Response.ErrorListener{error->
             Toast.makeText(this,"Error $error",Toast.LENGTH_LONG).show()
      }){

         }
     }*/
   /* public void boton_enviar_pulsado(View quien) {
        Log.d("clienterestandroid", "boton_enviar_pulsado");
        this.txtMediciones.setText("pulsado");

        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();

        elPeticionario.hacerPeticionREST("POST", "https://10.236.35.194/ProyecteMediambientS0/insertar.php", null,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        txtMediciones.setText("codigo respuesta= " + codigo + " <-> \n" + cuerpo);
                    }
                }
        );

        // (int codigo, String cuerpo) -> { elTexto.setText ("lo que sea"=; }

        String textoJSON = "{ 'Mediciones': '" + txtMediciones.toString() + "' }";


    }*/

    ///
    public void boto(View quien) {
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
        String textoJSON = "{\"Medicion\":\"" + txtMediciones.getText() + "\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.0.129/ProyecteMediambientS0/insertar.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        txtMediciones.setText("codigo respuesta= " + codigo + " <-> \n" + cuerpo);
                    }
                }
        );


    }
}