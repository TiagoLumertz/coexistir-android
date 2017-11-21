package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pojo.Usuario;

public class OpcoesActivity extends Activity {

    TextView tvOpcoes;
    ImageView ivOpcoes;
    Button btAlterarCad, btDesativarCad, btLogoff;

    Usuario usuario;
    Bundle parametros;

    SharedPreferences.Editor editor;
    SharedPreferences spOpcoes;

    public static final String NOME_ARQUIVO = "arquivo_opcoes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);
        this.iniComps();

        // PARÂMETROS RECEBIDOS ANTERIORMENTE
        parametros = getIntent().getExtras();

        this.btAlterarCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaAtualizar = new Intent(OpcoesActivity.this, CadastroActivity.class);
                Bundle parametros = new Bundle();
                parametros.putSerializable("usuario", usuario);
                itTelaAtualizar.putExtras(parametros);
                startActivity(itTelaAtualizar);
                finish();
            }
        });

        this.btLogoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear();
                editor.commit();
                chamaLogoff();
            }
        });

    }

    private void chamaLogoff() {
        Intent itLogoff = new Intent(OpcoesActivity.this, MainActivity.class);
        startActivity(itLogoff);
        finish();
    }


    private void iniComps(){
        this.btAlterarCad = (Button)findViewById(R.id.bt_alterar_cad);
        this.btDesativarCad = (Button)findViewById(R.id.bt_desativar_cad);
        this.btLogoff = (Button)findViewById(R.id.bt_logoff);
        this.tvOpcoes = (TextView)findViewById(R.id.tv_opcoes);
        this.ivOpcoes = (ImageView)findViewById(R.id.iv_opcoes);
        this.parametros = new Bundle();
        this.spOpcoes = getApplicationContext().getSharedPreferences(NOME_ARQUIVO,MODE_APPEND);
        this.editor = this.spOpcoes.edit();
    }

}
