package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import consumer.UsuarioConsumer;
import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends Activity {

    ImageView ivLogin;
    EditText etApelido, etSenha;
    TextView tvLogin;
    Button btLogar;

    Usuario usuario;
    UsuarioConsumer usuarioConsumer;

    SharedPreferences.Editor editor;
    SharedPreferences spLogin;

    public static final String NOME_ARQUIVO = "arquivo_login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.iniComps();

        // INTENÇÃO DE LOGAR
        this.btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setApelido(etApelido.getText().toString());
                usuario.setSenha(etSenha.getText().toString());
                chamaAutenticaWS(usuario.getApelido(), usuario.getSenha());
                Intent itTelaUsuarioActivity = new Intent(LoginActivity.this, TelaUsuarioActivity.class);
                startActivity(itTelaUsuarioActivity);
                finish();
            }
        });

    }

        // CHAMA A TELA APÓS LOGAR
        private void chamaTelaLogado() {
            Intent itTelaLogado = new Intent(LoginActivity.this, TelaUsuarioActivity.class);
            Bundle parametros = new Bundle();
            parametros.putSerializable("usuario", usuario);
            itTelaLogado.putExtras(parametros);
            startActivity(itTelaLogado);
            finish();
        }

        // CONSUMO DA AUTENTICAÇÃO
        private Usuario chamaAutenticaWS(String login, String senha) {
            this.usuarioConsumer.postAutentica(login, senha).enqueue(new Callback<Usuario>() {
                @Override
                public void onResponse(Call<Usuario> call, Response<Usuario> response) {

                    if(response.isSuccessful()) {
                        usuario = response.body();
                        editor.putString("login", usuario.getApelido());
                        editor.commit();
                        chamaTelaLogado();
                    } else {
                        try {
                            JSONObject jObjError = new JSONObject(response.errorBody().string());
                            Toast.makeText(LoginActivity.this, jObjError.getString("errorMessage"), Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Usuario> call, Throwable t) {

                }
            });

            return usuario;
        }

    // INICIALIZAÇÃO DE COMPONENTES
    private void iniComps() {
        this.ivLogin = (ImageView)findViewById(R.id.iv_login);
        this.etApelido = (EditText)findViewById(R.id.et_apelido);
        this.etSenha = (EditText)findViewById(R.id.et_senha);
        this.tvLogin = (TextView)findViewById(R.id.tv_login);
        this.btLogar = (Button)findViewById(R.id.bt_logar2);
        this.usuario = new Usuario();
        this.usuarioConsumer = new UsuarioConsumer();
        this.spLogin = getApplicationContext().getSharedPreferences(NOME_ARQUIVO,MODE_APPEND);
        this.editor = this.spLogin.edit();
    }

}