package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends Activity {

    ImageView ivLogin;
    EditText etApelido, etSenha;
    TextView tvLogin;
    Button btLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.iniComps();

        this.btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itTelaUsuarioActivity = new Intent(LoginActivity.this, TelaUsuarioActivity.class);
                startActivity(itTelaUsuarioActivity);
            }
        });

    }

    private void iniComps() {
        this.ivLogin = (ImageView)findViewById(R.id.iv_login);
        this.etApelido = (EditText)findViewById(R.id.et_apelido);
        this.etSenha = (EditText)findViewById(R.id.et_senha);
        this.tvLogin = (TextView)findViewById(R.id.tv_login);
        this.btLogar = (Button)findViewById(R.id.bt_logar2);
    }

}
