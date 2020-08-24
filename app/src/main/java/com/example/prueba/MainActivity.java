package com.example.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.textclassifier.ConversationAction;
import android.widget.TabHost;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MainActivity extends Activity {

    TabHost tbhConversores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbhConversores = (TabHost)findViewById(R.id.tbhConversor);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Almacenamiento").setContent(R.id.tabAlmacenamiento).setIndicator("Almacenamiento", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Peso").setContent(R.id.tabPeso).setIndicator("Peso", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.tabLongitud).setIndicator("Longitud", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Volumen").setContent(R.id.tabVolumen).setIndicator("Volumen", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Datos").setContent(R.id.tabDatos).setIndicator("Datos", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Moneda").setContent(R.id.tabMoneda).setIndicator("Moneda", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Tiempo").setContent(R.id.tabTiempo).setIndicator("Tiempo", null));



    }


    public void matriz (View View) {

        try {

            TextView ConverVal = (TextView) findViewById(R.id.txtCantidad);
            double can = Double.parseDouble(ConverVal.getText().toString());

            Spinner SpiVal;
            double valoresmatriz[][] = {

                    new double[]{1, 0.001, 100, 1000, 1000000, 1000000000, 0.0006, 1.0936, 3.2808, 39.9701, 0.00053996},

            };

            int de = 0, a = 0;
            double resp = 0;

            switch (tbhConversores.getCurrentTabTag()) {

                case "Longitud":
                    SpiVal = (Spinner) findViewById(R.id.spnLongitudA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnLongitudB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[0][a] / valoresmatriz[0][de] * can;
                    break;
            }

            ConverVal = (TextView) findViewById(R.id.txtRespuesta);
            ConverVal.setText("Respuesta: " + resp);
        }
            catch (Exception err){
            TextView temp = (TextView) findViewById(R.id.txtRespuesta);
            temp.setText("Porfavor Ingrese solo Numeros.");

            Toast.makeText(getApplicationContext(),"Por Favor Ingrese Solamente Numeros",Toast.LENGTH_LONG).show();

            }

            }

        }

