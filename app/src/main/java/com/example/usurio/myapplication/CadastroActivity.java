package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps() {
        this.Coexistir = (ImageView)findViewById(R.id.iv_coexistir);
        this.Pergunta = (TextView)findViewById(R.id.tv_pergunta_cad);
        this.btCadUsuario = (Button)findViewById(R.id.bt_cad_usuario);
        this.btCadAdmin = (Button)findViewById(R.id.bt_cad_admin);
    }

}
