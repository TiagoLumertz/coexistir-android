package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EventosActivity extends Activity {

    TextView tvEventos;
    ImageView ivEventos;
    Button btAddEventos, btAltEventos, btRemEventos, btMapaEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.btAddEventos = (Button)findViewById(R.id.bt_add_eventos);
        this.btAltEventos = (Button)findViewById(R.id.bt_alt_eventos);
        this.btRemEventos = (Button)findViewById(R.id.bt_rem_eventos);
        this.btMapaEventos = (Button)findViewById(R.id.bt_mapa_eventos);
        this.tvEventos = (TextView)findViewById(R.id.tv_eventos);
        this.ivEventos = (ImageView)findViewById(R.id.iv_eventos);

    }

}
