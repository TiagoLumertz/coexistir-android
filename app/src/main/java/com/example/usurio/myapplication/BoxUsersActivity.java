package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BoxUsersActivity extends Activity {

    TextView tvCorpo;
    ImageView ivCorpo;
    Button btElevar, btRanking, btVerAdmins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

    }

    private void iniComps(){
        this.btElevar = (Button)findViewById(R.id.bt_elevar);
        this.btRanking = (Button)findViewById(R.id.bt_ranking);
        this.btVerAdmins = (Button)findViewById(R.id.bt_ver_admins);
        this.tvCorpo = (TextView)findViewById(R.id.tv_corpo);
        this.ivCorpo = (ImageView)findViewById(R.id.iv_corpo);

    }

}
