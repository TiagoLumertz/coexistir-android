package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CorpoAdminActivity extends Activity {

    TextView tvCorpoAdmin;
    ImageView ivCorpoAdmin;
    Button btVerAvaliacoes, btVerSugestoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corpo_admin);
        this.iniComps();

    }

    private void iniComps(){
        this.btVerAvaliacoes = (Button)findViewById(R.id.bt_ver_ava);
        this.btVerSugestoes = (Button)findViewById(R.id.bt_ver_sug);
        this.tvCorpoAdmin = (TextView)findViewById(R.id.tv_ava_sug);
        this.ivCorpoAdmin = (ImageView)findViewById(R.id.iv_box);

    }

}
