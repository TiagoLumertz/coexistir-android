package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OpcoesActivity extends Activity {

    TextView tvOpcoes;
    ImageView ivOpcoes;
    Button btAlterarCad, btDesativarCad, btLogoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);
        this.iniComps();

    }

    private void iniComps(){
        this.btAlterarCad = (Button)findViewById(R.id.bt_alterar_cad);
        this.btDesativarCad = (Button)findViewById(R.id.bt_logoff);
        this.btLogoff = (Button)findViewById(R.id.bt_desativar_cad);
        this.tvOpcoes = (TextView)findViewById(R.id.tv_opcoes);
        this.ivOpcoes = (ImageView)findViewById(R.id.iv_opcoes);

    }

}
