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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    String nome, apelido, genero, posicao, cidade, uf, rg, email, senha;
    Date data;

    UsuarioConsumer uC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cadastro);
        this.iniCompsCadastro();
        this.iniArraysCadastro();

        this.btConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario u = new Usuario();

                pegaVariaveis();

                u.setNome(nome);
                u.setApelido(apelido);
                u.setGenero(genero);
                u.setPosReligiosa(posicao);
                u.setDataNasc(data);
                u.setRg(rg);
                u.setCidade(cidade);
                u.setUf(uf);
                u.setEmail(email);
                u.setSenha(senha);

                postCadastrarUsuario(u);

            }
        });

    }

    private void pegaVariaveis() {
        nome = etNome.getText().toString();
        apelido = etApelido.getText().toString();
        data = convDataNasc(etDataNasc.getText().toString());
        rg = etRg.getText().toString();
        cidade = etCidade.getText().toString();
        email = etEmail.getText().toString();
        senha = etSenha.getText().toString();
        pegaSpinners();
    }

    private void pegaSpinners() {
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
    }

    // MÉTODO DE CADASTRO DE USUÁRIOS
    private void postCadastrarUsuario(Usuario u) {
        this.uC.postCadastrar(u).enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if (response.isSuccessful()) {
                    Intent itLogado = new Intent(getApplicationContext(), TelaUsuarioActivity.class);
                    startActivity(itLogado);
                    finish();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Parabéns! Você está cadastrado!", Toast.LENGTH_SHORT);
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                t.printStackTrace();
                Toast toast = Toast.makeText(getApplicationContext(), "Não foi possível cadastrar", Toast.LENGTH_SHORT);
            }
        });
    }

    // INICIALIZAÇÃO DE COMPONENTES (GERAL)
    protected void iniCompsCadastro() {
        this.btConfirma = (Button)findViewById(R.id.bt_conf_cad);
        this.etNome = (EditText)findViewById(R.id.et_nome);
        this.etApelido = (EditText)findViewById(R.id.et_apelido);
        this.etDataNasc = (EditText)findViewById(R.id.et_data_nasc);
        this.etCidade = (EditText)findViewById(R.id.et_cidade);
        this.etRg = (EditText)findViewById(R.id.et_rg);
        this.etEmail = (EditText)findViewById(R.id.et_email);
        this.etSenha = (EditText)findViewById(R.id.et_senha);
        this.uC = new UsuarioConsumer();
    }

    // INICIALIZAÇÃO DE COMPONENTES (ARRAYS E/DOS SPINNERS)
    private void iniArraysCadastro() {
        this.spGenero = (Spinner)findViewById(R.id.sp_genero);
        ArrayAdapter<String> spinnerArrayGenero = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, generos);
        spinnerArrayGenero.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spGenero.setAdapter(spinnerArrayGenero);
        generos.add("Masculino");
        generos.add("Feminino");
        generos.add("Outro");

        this.spPosReligiosa = (Spinner)findViewById(R.id.sp_pos_religiosa);
        ArrayAdapter<String> spinnerArrayPosReligiosa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, posicoes);
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
        ArrayAdapter<String> spinnerArrayUf = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ufs);
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

    private Date convDataNasc(String d) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = (Date) format.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }

}