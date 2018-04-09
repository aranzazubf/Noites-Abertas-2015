package com.aranzazu.appnoites15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void inicio1(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"xuventude@pontevedra.eu"});
        startActivity(Intent.createChooser(emailIntent, "Enviar mail"));


    }

    public void compartir(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");
        //Aqui habra que cambiar la edici�n y fijarse si la web sigue siendo la misma//
        intent.putExtra(Intent.EXTRA_SUBJECT, "Noites Abertas XIV Edici�n, " +
                "O maior programa cultural da bisbarra. Ocio, cultura, formaci�n no teu concello");
        intent.putExtra(Intent.EXTRA_TEXT, "http://www.noitesabertas.com");

        startActivity(Intent.createChooser(intent, "Compartir"));

    }
}

		
