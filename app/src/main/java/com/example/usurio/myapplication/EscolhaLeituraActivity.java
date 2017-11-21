package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class EscolhaLeituraActivity extends Activity {

    TextView tvLeitura, tvAgnosticismo, tvAteismo, tvBudismo, tvCatolicismo, tvEspiritismo, tvEvangelicismo, tvJudaismo, tvTestemunhas, tvUmbandismo;
    ImageButton ibLeitura, ibAgnosticismo, ibAteismo, ibBudismo, ibCatolicismo, ibEspiritismo, ibEvangelicismo, ibJudaismo, ibTestemunhas, ibUmbandismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_leitura);
        this.iniComps();

        this.ibCatolicismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaConteudo();
            }
        });

    }

    private void chamaConteudo() {
        Intent itLogoff = new Intent(EscolhaLeituraActivity.this, LeituraActivity.class);
        startActivity(itLogoff);
        finish();
    }

    private void iniComps(){
        this.tvLeitura = (TextView)findViewById(R.id.tv_leitura);
        this.tvAgnosticismo = (TextView)findViewById(R.id.tv_agnosticismo);
        this.tvAteismo = (TextView)findViewById(R.id.tv_ateismo);
        this.tvBudismo = (TextView)findViewById(R.id.tv_budismo);
        this.tvCatolicismo = (TextView)findViewById(R.id.tv_catolicismo);
        this.tvEspiritismo = (TextView)findViewById(R.id.tv_espiritismo);
        this.tvEvangelicismo = (TextView)findViewById(R.id.tv_evangelicos);
        this.tvJudaismo = (TextView)findViewById(R.id.tv_judaismo);
        this.tvTestemunhas = (TextView)findViewById(R.id.tv_testemunhas);
        this.tvUmbandismo = (TextView)findViewById(R.id.tv_umbandismo);
        this.ibLeitura = (ImageButton)findViewById(R.id.ib_leitura);
        this.ibAgnosticismo = (ImageButton)findViewById(R.id.ib_agnosticismo);
        this.ibAteismo = (ImageButton)findViewById(R.id.ib_ateismo);
        this.ibBudismo = (ImageButton)findViewById(R.id.ib_budismo);
        this.ibCatolicismo = (ImageButton)findViewById(R.id.ib_catolicismo);
        this.ibEspiritismo = (ImageButton)findViewById(R.id.ib_espiritismo);
        this.ibEvangelicismo = (ImageButton)findViewById(R.id.ib_evangelicos);
        this.ibJudaismo = (ImageButton)findViewById(R.id.ib_judaismo);
        this.ibTestemunhas = (ImageButton)findViewById(R.id.ib_testemunhas);
        this.ibUmbandismo = (ImageButton)findViewById(R.id.ib_umbandismo);

    }

}
