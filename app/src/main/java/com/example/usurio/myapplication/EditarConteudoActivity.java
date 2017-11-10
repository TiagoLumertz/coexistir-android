package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EditarConteudoActivity extends Activity {

    TextView tvEditCont;
    ImageView ivEditCont;
    Button btAlterarCad, btHistEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_conteudo);
        this.iniComps();

    }

    private void iniComps(){
        this.btAlterarCad = (Button)findViewById(R.id.bt_alterar_cad);
        this.btHistEdit = (Button)findViewById(R.id.bt_hist_edit);
        this.tvEditCont = (TextView)findViewById(R.id.tv_edit_cont);
        this.ivEditCont = (ImageView)findViewById(R.id.iv_edit_cont);

    }

}
