package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GuiaActivity extends Activity {

    TextView tvPergunta1, tvPergunta2, tvResposta1, tvResposta2A, tvResposta2B, tvResposta2C, tvResposta2D, tvResposta2E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
        this.iniComps();

    }

    private void iniComps(){
        this.tvPergunta1 = (TextView)findViewById(R.id.tv_pergunta1);
		this.tvPergunta2 = (TextView)findViewById(R.id.tv_pergunta2);
        this.tvResposta1 = (TextView)findViewById(R.id.tv_resposta1);
        this.tvResposta2A = (TextView)findViewById(R.id.tv_resposta2a);
        this.tvResposta2B = (TextView)findViewById(R.id.tv_resposta2b);
        this.tvResposta2C = (TextView)findViewById(R.id.tv_resposta2c);
        this.tvResposta2D = (TextView)findViewById(R.id.tv_resposta2d);
        this.tvResposta2E = (TextView)findViewById(R.id.tv_resposta2e);

    }

}
