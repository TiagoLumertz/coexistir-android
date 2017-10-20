package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaUsuarioActivity extends Activity {

    ImageView ivNivel;
    ImageButton ibLeitura, ibAmigos, ibCentros, ibEventos, ibGuia, ibAvaliacao, ibNotificacao, ibOpcoesUsuario;
    TextView tvLeitura, tvAmigos, tvCentros, tvEventos, tvGuia, tvAvaliacao, tvOla, tvNivel, tvPontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.ivNivel = (ImageView) findViewById(R.id.iv_nivel);
        this.ibLeitura = (ImageButton)findViewById(R.id.ib_leitura);
        this.ibAmigos = (ImageButton)findViewById(R.id.ib_amigos);
        this.ibCentros = (ImageButton)findViewById(R.id.ib_centros);
        this.ibEventos = (ImageButton)findViewById(R.id.ib_eventos);
        this.ibGuia = (ImageButton)findViewById(R.id.ib_guia);
        this.ibAvaliacao = (ImageButton)findViewById(R.id.ib_avaliacao);
        this.ibNotificacao = (ImageButton)findViewById(R.id.ib_notificacao);
        this.ibOpcoesUsuario = (ImageButton)findViewById(R.id.ib_opcoes_usuario);
        this.tvLeitura = (TextView)findViewById(R.id.tv_leitura);
        this.tvAmigos = (TextView)findViewById(R.id.tv_amigos);
        this.tvCentros = (TextView)findViewById(R.id.tv_centros);
        this.tvEventos = (TextView)findViewById(R.id.tv_eventos);
        this.tvGuia = (TextView)findViewById(R.id.tv_guia);
        this.tvAvaliacao = (TextView)findViewById(R.id.tv_avaliacao);
        this.tvOla = (TextView)findViewById(R.id.tv_ola);
        this.tvNivel = (TextView)findViewById(R.id.tv_nivel);
        this.tvPontos = (TextView)findViewById(R.id.tv_pontos);
    }

}
