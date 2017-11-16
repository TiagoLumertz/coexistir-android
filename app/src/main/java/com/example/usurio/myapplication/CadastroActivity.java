package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import consumer.UsuarioConsumer;
import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroActivity extends Activity {

    Button btConfirma;

    Spinner spGenero, spPosReligiosa, spUf;

    EditText etNome, etApelido, etDataNasc, etCidade, etRg, etEmail, etSenha;

    List<String> generos = new ArrayList<String>();
    List<String> posicoes = new ArrayList<String>();
    List<String> ufs = new ArrayList<String>();

    String genero, posicao, uf;

    Usuario u;

    UsuarioConsumer uC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cadastro);
        this.iniComps();
        this.iniArrays();

        // PEGANDO O VALOR DO SPINNER "GÊNERO"
        spGenero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                genero = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // PEGANDO O VALOR DO SPINNER "POSIÇÃO RELIGIOSA"
        spPosReligiosa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posicao = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // PEGANDO O VALOR DO SPINNER "UF"
        spUf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                uf = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        this.btConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // ADICIONANDO OS VALORES AO OBJETO USUÁRIO
                u.setNome(etNome.getText().toString());
                u.setApelido(etApelido.getText().toString());
                u.setSenha(etSenha.getText().toString());
                u.setDataNasc((Date) etDataNasc.getText());
                u.setCidade(etCidade.getText().toString());
                u.setRg(Integer.parseInt(etRg.getText().toString()));

                // MÉTODO DE CADASTRO PELO CONSUMER
                uC.postCadastrar(u).enqueue(new Callback<Usuario>() {
                    @Override
                    public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                        u = response.body();
                        Intent itLogado = new Intent(CadastroActivity.this, TelaUsuarioActivity.class);
                        Bundle p = new Bundle();
                        p.putSerializable("usuario", u);
                        itLogado.putExtras(p);
                        startActivity(itLogado);
                        finish();
                        Toast.makeText(CadastroActivity.this, "Cadastro efetuado com sucesso!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Usuario> call, Throwable t) {
                        Toast.makeText(CadastroActivity.this, "Não foi possível o cadastro", Toast.LENGTH_SHORT).show();
                    }
                });

                // MÉTODO DE ATUALIZAÇÃO PELO CONSUMER
                    uC.putAtualizar(u).enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                            if (response.isSuccessful()) {
                                Intent itLogado = new Intent(CadastroActivity.this, TelaUsuarioActivity.class);
                                Bundle parametros = new Bundle();
                                parametros.putSerializable("usuario", u);
                                itLogado.putExtras(parametros);
                                startActivity(itLogado);
                                finish();
                            }
                        }

                        @Override
                        public void onFailure(Call<Usuario> call, Throwable t) {
                            Toast.makeText(CadastroActivity.this, "Não foi possível atualizar o cadastro", Toast.LENGTH_SHORT).show();
                        }
                    });

            }
        });
        
    }

    private void iniComps() {
        this.btConfirma = (Button)findViewById(R.id.bt_conf_cad);
        this.etNome = (EditText)findViewById(R.id.et_nome);
        this.etApelido = (EditText)findViewById(R.id.et_apelido);
        this.etDataNasc = (EditText)findViewById(R.id.et_data_nasc);
        this.etCidade = (EditText)findViewById(R.id.et_cidade);
        this.etRg = (EditText)findViewById(R.id.et_rg);
        this.etSenha = (EditText)findViewById(R.id.et_senha);
        this.u = new Usuario();
        this.uC = new UsuarioConsumer();
    }

    private void iniArrays() {
        this.spGenero = (Spinner)findViewById(R.id.sp_genero);
        ArrayAdapter<String> arrayGenero = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, generos);
        ArrayAdapter<String> spinnerArrayGenero = arrayGenero;
        spinnerArrayGenero.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spGenero.setAdapter(spinnerArrayGenero);
        generos.add("Masculino");
        generos.add("Feminino");
        generos.add("Outros");

        this.spPosReligiosa = (Spinner)findViewById(R.id.sp_pos_religiosa);
        ArrayAdapter<String> arrayPosReligiosa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, posicoes);
        ArrayAdapter<String> spinnerArrayPosReligiosa = arrayPosReligiosa;
        spinnerArrayPosReligiosa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spPosReligiosa.setAdapter(spinnerArrayPosReligiosa);
        posicoes.add("Agnóstico");
        posicoes.add("Ateu");
        posicoes.add("Budista");
        posicoes.add("Católico");
        posicoes.add("Evangélico");
        posicoes.add("Espírita");
        posicoes.add("Judeu");
        posicoes.add("Testemunha de Jeová");
        posicoes.add("Umbandista");
        posicoes.add("Outra");

        this.spUf = (Spinner)findViewById(R.id.sp_uf);
        ArrayAdapter<String> arrayUf = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ufs);
        ArrayAdapter<String> spinnerArrayUf = arrayUf;
        spinnerArrayUf.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spUf.setAdapter(spinnerArrayUf);
        ufs.add("AC");
        ufs.add("AL");
        ufs.add("AM");
		ufs.add("AP");
		ufs.add("BA");
		ufs.add("CE");
		ufs.add("DF");
		ufs.add("ES");
		ufs.add("GO");
		ufs.add("MA");
		ufs.add("MG");
		ufs.add("MS");
		ufs.add("MT");
		ufs.add("PA");
		ufs.add("PB");
		ufs.add("PE");
		ufs.add("PI");
		ufs.add("PR");
		ufs.add("RJ");
		ufs.add("RN");
		ufs.add("RO");
		ufs.add("RR");
		ufs.add("RS");
		ufs.add("SC");
		ufs.add("SE");
		ufs.add("SP");
		ufs.add("TO");
    }

}
