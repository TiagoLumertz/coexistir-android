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
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.tvLeitura = (TextView)findViewById(R.id.tv_leitura);
        this.tvEx1 = (TextView)findViewById(R.id.tv_exemplo1);
        this.tvEx2 = (TextView)findViewById(R.id.tv_exemplo2);
        this.tvEx3 = (TextView)findViewById(R.id.tv_exemplo3);
        this.tvEx4 = (TextView)findViewById(R.id.tv_exemplo4);
        this.tvEx5 = (TextView)findViewById(R.id.tv_exemplo5);
        this.tvEx6 = (TextView)findViewById(R.id.tv_exemplo6);
        this.tvEx7 = (TextView)findViewById(R.id.tv_exemplo7);
        this.tvEx8 = (TextView)findViewById(R.id.tv_exemplo8);
        this.tvEx9 = (TextView)findViewById(R.id.tv_exemplo9);
        this.ibEx1 = (ImageButton)findViewById(R.id.ib_exemplo1);
        this.ibEx2 = (ImageButton)findViewById(R.id.ib_exemplo2);
        this.ibEx3 = (ImageButton)findViewById(R.id.ib_exemplo3);
        this.ibEx4 = (ImageButton)findViewById(R.id.ib_exemplo4);
        this.ibEx5 = (ImageButton)findViewById(R.id.ib_exemplo5);
        this.ibEx6 = (ImageButton)findViewById(R.id.ib_exemplo6);
        this.ibEx7 = (ImageButton)findViewById(R.id.ib_exemplo7);
        this.ibEx8 = (ImageButton)findViewById(R.id.ib_exemplo8);
        this.ibEx9 = (ImageButton)findViewById(R.id.ib_exemplo9);
    }

}
