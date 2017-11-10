package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class EscolhaLeituraActivity extends Activity {

    TextView tvLeitura, tvEx1, tvEx2, tvEx3, tvEx4, tvEx5, tvEx6, tvEx7, tvEx8, tvEx9;
    ImageButton ibEx1, ibEx2, ibEx3, ibEx4, ibEx5, ibEx6, ibEx7, ibEx8, ibEx9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_leitura);
        this.iniComps();

    }

    private void iniComps(){
        this.tvLeitura = (TextView)findViewById(R.id.tv_leitura);
    }

}
