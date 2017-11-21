package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import pojo.Usuario;

public class TelaUsuarioActivity extends Activity {

    ImageView ivNivel;
    ImageButton ibLeitura, ibAmigos, ibCentros, ibEventos, ibGuia, ibAvaliacao, ibNotificacao, ibOpcoesUsuario;
    TextView tvLeitura, tvAmigos, tvCentros, tvEventos, tvGuia, tvAvaliacao, tvOla, tvNivel, tvPontos;
    Usuario usuario;
    Bundle parametros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_usuario);
        this.iniComps();

        parametros = getIntent().getExtras();
        if (parametros != null) {
            tvOla.setText("Olá, " + parametros.getString("apelido") + "!");
        }

        this.ibLeitura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaLerConteudo();
            }
        });

        this.ibAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaListaAmigos();
            }
        });

        this.ibCentros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaCentros();
            }
        });

        this.ibEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaEventos();
            }
        });

        this.ibGuia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaGuia();
            }
        });

        this.ibAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaAvaliacao();
            }
        });

        this.ibOpcoesUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaOpcoes();
            }
        });

    }

    private void chamaOpcoes() {
        Intent itOpcoes = new Intent(TelaUsuarioActivity.this, OpcoesActivity.class);
        startActivity(itOpcoes);
        itOpcoes.putExtras(parametros);
        finish();
    }

    private void chamaAvaliacao() {
        Intent itAvaliacao = new Intent(TelaUsuarioActivity.this, AvaliacaoActivity.class);
        startActivity(itAvaliacao);
        itAvaliacao.putExtras(parametros);
        finish();
    }

    private void chamaGuia() {
        Intent itGuia = new Intent(TelaUsuarioActivity.this, GuiaActivity.class);
        startActivity(itGuia);
        finish();
    }

    private void chamaEventos() {
        Intent itEventos = new Intent(TelaUsuarioActivity.this, EventosActivity.class);
        startActivity(itEventos);
        itEventos.putExtras(parametros);
        finish();
    }

    private void chamaCentros() {
        Intent itCentros = new Intent(TelaUsuarioActivity.this, CentrosActivity.class);
        startActivity(itCentros);
        itCentros.putExtras(parametros);
        finish();
    }

    // CHAMA A TELA "LISTA DE AMIGOS"
    private void chamaListaAmigos() {
        Intent itListaAmigos = new Intent(TelaUsuarioActivity.this, AmigosActivity.class);
        startActivity(itListaAmigos);
        itListaAmigos.putExtras(parametros);
        finish();
    }

    // CHAMA A TELA "LER CONTEÚDOS"
    private void chamaLerConteudo() {
        Intent itLerConteudo = new Intent(TelaUsuarioActivity.this, EscolhaLeituraActivity.class);
        startActivity(itLerConteudo);
        itLerConteudo.putExtras(parametros);
        finish();
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
        this.usuario = new Usuario();
        this.parametros = new Bundle();
    }
}