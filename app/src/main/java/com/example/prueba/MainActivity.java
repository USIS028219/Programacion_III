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
                    new double[]{1, 1000, 1000000, 0.001, 1e-6, 1e-9, 1e-12, 8e+6, 2e+6, 8000},
                    new double[]{1, 0.84, 105.41, 0.75, 1.36, 8.75, 34.86, 24.66, 7.71, 21.75},
                    new double[]{ 0.001,1,10,1000,28.3495,0.5,1000000},
                    new double[]{ 8e+6,8000,1000,8,1,0.008,0.001,8e-6,1e-6},
                    new double[]{ 1, 0.264172,1000,0.001,0.0353147,4.16667,67.628,33.814},
                    new double[]{ 8.64e+7,86400,1440,24,1,0.142857,0.032876643423,0.00273973,0.000273973,2.73973e-5},


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

                case "Almacenamiento":
                    SpiVal = (Spinner) findViewById(R.id.spnAlmacenamientoA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnAlmacenamientoB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[1][a] / valoresmatriz[1][de] * can;
                    break;

                case "Moneda":
                    SpiVal = (Spinner) findViewById(R.id.spnMonedaA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnMonedaB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[2][a] / valoresmatriz[2][de] * can;
                    break;

                case "Peso":
                    SpiVal = (Spinner) findViewById(R.id.spnPesoA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnPesoB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[3][a] / valoresmatriz[3][de] * can;
                    break;

                case "Datos":
                    SpiVal = (Spinner) findViewById(R.id.spnDatosA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnDatosB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[4][a] / valoresmatriz[4][de] * can;
                    break;

                case "Volumen":
                    SpiVal = (Spinner) findViewById(R.id.spnVolumenA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnVolumenB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[5][a] / valoresmatriz[5][de] * can;
                    break;

                case "Tiempo":
                    SpiVal = (Spinner) findViewById(R.id.spnTiempoA);
                    de = SpiVal.getSelectedItemPosition();
                    SpiVal = (Spinner) findViewById(R.id.spnTiempoB);
                    a = SpiVal.getSelectedItemPosition();
                    resp = valoresmatriz[6][a] / valoresmatriz[6][de] * can;
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

