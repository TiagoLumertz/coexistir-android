package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CentrosActivity extends Activity {

    TextView tvCentros;
    ImageView ivCentros;
    Button btAddCentros, btAltCentros, btRemCentros, btMapaCentros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centros);
        this.iniComps();

    }

    private void iniComps(){
        this.btAddCentros = (Button)findViewById(R.id.bt_add_centros);
        this.btAltCentros = (Button)findViewById(R.id.bt_alt_centros);
        this.btRemCentros = (Button)findViewById(R.id.bt_rem_centros);
        this.btMapaCentros = (Button)findViewById(R.id.bt_mapa_centros);
        this.tvCentros = (TextView)findViewById(R.id.tv_centros);
        this.ivCentros = (ImageView)findViewById(R.id.iv_centros);

    }

}
