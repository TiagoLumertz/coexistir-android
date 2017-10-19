package com.example.usurio.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Coexistir;
    Button btLogin;
    Button btCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

        this.btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itCadastro = new Intent (MainActivity.this, CadastroActivity.class);
                startActivity(itCadastro);
            }
        });

        this.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itLogin = new Intent (MainActivity.this, LoginActivity.class);
                startActivity(itLogin);
            }
        }

        );

    }

    private void iniComps() {
        this.Coexistir = (ImageView)findViewById(R.id.iv_coexistir);
        this.btLogin = (Button)findViewById(R.id.bt_fazer_login);
        this.btCadastro = (Button)findViewById(R.id.bt_fazer_cadastro);
    }

}

