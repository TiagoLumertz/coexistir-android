/*package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import consumer.UsuarioConsumer;
import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DadosCadastroActivity extends Activity {

    TextView tvCadastro;
    Button btConfCadastro;

    // VARIÁVEIS
    EditText etNome, etApelido, etDataNasc, etCidade, etRg, etEmail, etSenha;

    // SPINNERS
    Spinner sp1, sp2, sp3;

    // ARRAYS PARA COLOCAR NOS SPINNERS
    String[] v1, v2, v3;

    // USUÁRIO E CONSUMO
    Usuario usuario;
    UsuarioConsumer usuarioConsumer;

    // PARÂMETROS RECEBIDOS ANTERIORMENTE
    Bundle parametros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*this.v1 = new String[] {"Gênero", "Masculino", "Feminino", "Outro"};
        this.v2 = new String[] {"Posição Religiosa", "Agnóstico", "Ateu", "Budista", "Católico", "Evangélico", "Espírita", "Judeu", "Testemunha de Jeová", "Umbandista", "Outra"};
        this.v3 = new String[] {"UF", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};

        // ADAPTERS DOS ARRAYS
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.v1, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);		
		this.sp1.setAdapter(adapter1);
        this.sp1.setSelection(1);
        this.sp1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {}
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        this.sp2.setAdapter(adapter2);
        this.sp2.setSelection(1);
        this.sp2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {}
        });

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        this.sp3.setAdapter(adapter3);
        this.sp3.setSelection(1);
        this.sp3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {}
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cadastro);
        this.iniComps();

        // LEITURA DAS ENTRADAS
        this.etNome.setText(this.usuario.getNome());
        this.etApelido.setText(this.usuario.getApelido());
        this.etSenha.setText(this.usuario.getSenha());
        this.etDataNasc.setText((CharSequence) this.usuario.getDataNasc());
        this.etCidade.setText(this.usuario.getCidade());
        this.etRg.setText((int) this.usuario.getRg());
        this.etEmail.setText(this.usuario.getEmail());
        this.etSenha.setText(this.usuario.getSenha());

        this.btConfCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // VALORES DOS CAMPOS ADICIONADOS AO OBJETO USUÁRIO
                usuario.setNome(etNome.getText().toString());
                usuario.setApelido(etApelido.getText().toString());
                usuario.setDataNasc((Date) etDataNasc.getText());
                usuario.setCidade(etCidade.getText().toString());
                usuario.setRg(Integer.parseInt(etRg.getText().toString()));
                usuario.setEmail(etEmail.getText().toString());
                usuario.setSenha(etSenha.getText().toString());

                parametros = new Bundle();

                // CHAMANDO O CONSUMER (POST)
                    usuarioConsumer.postCadastrar(usuario).enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                                usuario = response.body();
                                Intent itTelaLogado = new Intent(DadosCadastroActivity.this, TelaUsuarioActivity.class);
                                parametros.putSerializable("usuario", usuario);
                                itTelaLogado.putExtras(parametros);
                                startActivity(itTelaLogado);
                                finish();
                        }

                        @Override
                        public void onFailure(Call<Usuario> call, Throwable t) {
                            Toast.makeText(DadosCadastroActivity.this, "Não foi possível o cadastro", Toast.LENGTH_SHORT).show();
                        }
                    });

                    // CHAMANDO O CONSUMER (PUT)
                    usuarioConsumer.putAtualizar(usuario).enqueue(new Callback<Usuario>() {
                        @Override
                        public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                            if(response.isSuccessful()) {
                                Intent itTelaLogado = new Intent(DadosCadastroActivity.this, TelaUsuarioActivity.class);
                                Bundle parametros = new Bundle();
                                parametros.putSerializable("usuario", usuario);
                                itTelaLogado.putExtras(parametros);
                                startActivity(itTelaLogado);
                                finish();
                            }
                        }

                        @Override
                        public void onFailure(Call<Usuario> call, Throwable t) {
                            Toast.makeText(DadosCadastroActivity.this, "Não foi possível atualizar os dados", Toast.LENGTH_SHORT).show();
                        }
                    });
            }
        });
    }

    private void iniComps() {
        this.tvCadastro = (TextView)findViewById(R.id.tv_cad);
        this.btConfCadastro = (Button)findViewById(R.id.bt_conf_cad);
        this.etNome = (EditText) findViewById(R.id.et_nome);
        this.etApelido = (EditText)findViewById(R.id.et_apelido);
        this.etDataNasc = (EditText)findViewById(R.id.et_data_nasc);
        this.etCidade = (EditText)findViewById(R.id.et_cidade);
        this.etRg = (EditText)findViewById(R.id.et_rg);
        this.etEmail = (EditText)findViewById(R.id.et_email);
        this.etSenha = (EditText)findViewById(R.id.et_senha);

        this.sp1 = (Spinner)findViewById(R.id.sp_genero);
        this.sp2 = (Spinner)findViewById(R.id.sp_pos_religiosa);
        this.sp3 = (Spinner)findViewById(R.id.sp_uf);

        this.usuario = new Usuario();
        this.usuarioConsumer = new UsuarioConsumer();
        this.parametros = new Bundle();
    }

}*/