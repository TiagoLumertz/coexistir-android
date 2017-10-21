package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CadastroActivity extends Activity {

    ImageView Coexistir;
    TextView Pergunta;
    Button btCadUsuario;
    Button btCadAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

		// INICIALIZAÇÃO DE COMPONENTES
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

        this.btCadUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itDadosCadastro = new Intent();
                startActivity(itDadosCadastro);
            }
        });

        this.btCadAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itDadosCadastro = new Intent();
                startActivity(itDadosCadastro);
            }
        });

    }

    private void iniComps() {
        this.Coexistir = (ImageView)findViewById(R.id.iv_coexistir);
        this.Pergunta = (TextView)findViewById(R.id.tv_pergunta_cad);
        this.btCadUsuario = (Button)findViewById(R.id.bt_cad_usuario);
        this.btCadAdmin = (Button)findViewById(R.id.bt_cad_admin);
    }

}
