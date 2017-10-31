package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class TelaAdminActivity extends Activity {

    ImageButton ibEdConteudos, ibCorpAdmin, ibAvaliacoes, ibNotificacao, ibOpcoesAdmin;
    TextView tvEdConteudos, tvCorpAdmin, tvAvaliacoes, tvOla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.ibEdConteudos = (ImageButton)findViewById(R.id.ib_leitura);
        this.ibCorpAdmin = (ImageButton)findViewById(R.id.ib_corp_admin);
        this.ibAvaliacoes = (ImageButton)findViewById(R.id.ib_avaliacoes);
        this.ibNotificacao = (ImageButton)findViewById(R.id.ib_notificacao);
        this.ibOpcoesAdmin = (ImageButton)findViewById(R.id.ib_opcoes_usuario);
        this.tvEdConteudos = (TextView)findViewById(R.id.tv_ed_conteudos);
        this.tvCorpAdmin = (TextView)findViewById(R.id.tv_corp_admin);
        this.tvAvaliacoes = (TextView)findViewById(R.id.tv_avaliacao);
        this.tvOla = (TextView)findViewById(R.id.tv_ola);
    }

}
