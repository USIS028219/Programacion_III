package com.example.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tbhConversores = (TabHost)findViewById(R.id.tbhConversor);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Almacenamiento").setContent(R.id.tabAlmacenamiento).setIndicator("Almacenamiento", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Peso").setContent(R.id.tabPeso).setIndicator("Peso", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.tabLongitud).setIndicator("Longitud", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Volumen").setContent(R.id.tabVolumen).setIndicator("Volumen", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Datos").setContent(R.id.tabDatos).setIndicator("Datos", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Moneda").setContent(R.id.tabMoneda).setIndicator("Moneda", null));
        tbhConversores.addTab(tbhConversores.newTabSpec("Tiempo").setContent(R.id.tabTiempo).setIndicator("Tiempo", null));



    }



}