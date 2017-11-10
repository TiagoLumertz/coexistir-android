package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class AmigosActivity extends Activity {

    ImageView ivAmigos;
    Button btAddAmigos, btRemAmigos, btNotAmigos, btLstAmigos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos);
        this.iniComps();

    }

    private void iniComps(){
        this.ivAmigos = (ImageView)findViewById(R.id.iv_amigos);
        this.btAddAmigos = (Button)findViewById(R.id.bt_add_amigos);
        this.btRemAmigos = (Button)findViewById(R.id.bt_rem_amigos);
        this.btLstAmigos = (Button)findViewById(R.id.bt_lst_amigos);
        this.btNotAmigos = (Button)findViewById(R.id.bt_not_amigos);
    }

}