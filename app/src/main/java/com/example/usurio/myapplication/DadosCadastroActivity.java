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
    EditText etNome, etApelido, etDataNasc, etCidade, etRg, etEmail, etSenha;

    private String[] vetorGenero = {"Gênero","Masculino", "Feminino", "Outro"};
    private Spinner spGenero;
	
	private String[] vetorPosReligiosa = {	"Posição Religiosa", "Agnóstico", "Ateu", "Budista", "Católico", "Evangélico",
											"Espírita", "Judeu", "Testemunha de Jeová", "Umbandista", "Outra"};
    private Spinner spPosReligiosa;
	
	private String[] vetorUf = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO",
								"MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR",
								"RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
    private Spinner spUf;

    Usuario usuario;
    UsuarioConsumer uC;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cadastro);
        this.iniComps();

        // VALORES DOS CAMPOS ADICIONADOS AO OBJETO USUÁRIO
        usuario.setNome(etNome.getText().toString());
        usuario.setApelido(etApelido.getText().toString());
        usuario.setDataNasc((Date) etDataNasc.getText());
        usuario.setCidade(etCidade.getText().toString());
        usuario.setRg(Long.parseLong(etRg.getText().toString()));
        usuario.setEmail(etEmail.getText().toString());
        usuario.setSenha(etSenha.getText().toString());

        // ADAPTERS DOS ARRAYS
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

        // CHAMANDO O CONSUMER
        uC.postCadastrarUsuario(usuario).enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                usuario = response.body();
                Intent itTelaLogado = new Intent(DadosCadastroActivity.this, TelaUsuarioActivity.class);
                Bundle parametro = new Bundle();
                parametro.putSerializable("usuario", usuario);
                itTelaLogado.putExtras(parametro);
                startActivity(itTelaLogado);
                finish();
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Toast.makeText(DadosCadastroActivity.this, "Não foi possível o cadastro", Toast.LENGTH_SHORT).show();
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
        this.etEmail  = (EditText)findViewById(R.id.et_email);
        this.etSenha = (EditText)findViewById(R.id.et_senha);
        this.spGenero = (Spinner)findViewById(R.id.sp_genero);
        this.spPosReligiosa = (Spinner)findViewById(R.id.sp_pos_religiosa);
        this.spUf = (Spinner)findViewById(R.id.sp_uf);
        this.usuario = new Usuario();
        this.uC = new UsuarioConsumer();
    }

}
