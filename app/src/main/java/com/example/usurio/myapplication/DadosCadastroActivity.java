package com.example.usurio.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class DadosCadastroActivity extends Activity {

    private String[] vetorGenero = {"Gênero","Masculino", "Feminino", "Outro"};
    private Spinner spGenero;
	
	private String[] vetorPosReligiosa = {	"Posição Religiosa", "Agnóstico", "Ateu", "Budista", "Católico", "Evangélico",
											"Espírita", "Judeu", "Testemunha de Jeová", "Umbandista", "Outra"};
    private Spinner spPosReligiosa;
	
	private String[] vetorUf = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO",
								"MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR",
								"RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
    private Spinner spUf;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.iniComps();

        ArrayAdapter<String> adapterGenero = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vetorGenero);
        this.spGenero.setAdapter(adapterGenero);
        this.spGenero.setSelection(0);

        this.spGenero.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
		
		ArrayAdapter<String> adapterPosReligiosa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vetorPosReligiosa);
        this.spPosReligiosa.setAdapter(adapterPosReligiosa);
        this.spPosReligiosa.setSelection(0);

        this.spPosReligiosa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
		
		ArrayAdapter<String> adapterUf = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vetorUf);
        this.spUf.setAdapter(adapterUf);
        this.spUf.setSelection(0);

        this.spUf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }

    private void iniComps() {
        this.spGenero = (Spinner)findViewById(R.id.sp_genero);
        this.spPosreligiosa = (Spinner)findViewById(R.id.sp_pos_religiosa);
        this.spUf = (Spinner)findViewById(R.id.sp_uf);


    }

}
