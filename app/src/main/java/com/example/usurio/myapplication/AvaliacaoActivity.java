package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class AvaliacaoActivity extends Activity {

    ImageView ivAvaliacao;
    TextView tvNota, tvSugestao, tvExp;
    Button btEnvAvaliacao;
    RatingBar rbAvaliacao;
    EditText etSugestao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.tvNota = (TextView)findViewById(R.id.tv_nota);
        this.tvSugestao = (TextView)findViewById(R.id.tv_sugestao);
        this.tvExp = (TextView)findViewById(R.id.tv_experiencia);
        this.ivAvaliacao = (ImageView)findViewById(R.id.iv_avaliacao);
        this.btEnvAvaliacao = (Button)findViewById(R.id.bt_enviar_av);
        this.etSugestao = (EditText)findViewById(R.id.et_sugestao);
        this.rbAvaliacao = (RatingBar)findViewById(R.id.rb_avaliacao);
    }

}