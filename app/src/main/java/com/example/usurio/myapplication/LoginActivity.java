package com.example.usurio.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
    Button btLogar;

    Usuario usuario;
    UsuarioConsumer uC;

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

                if(autenticacaoUsuario(etApelido.getText().toString(), etSenha.getText().toString()) != null) {
                    editor.putString("apelido", usuario.getApelido());
                    editor.commit();
                    chamaTelaLogado();
                    Toast.makeText(LoginActivity.this, "Login feito com sucesso!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Usuário ou senha errado(s)", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

        // CHAMA A TELA APÓS LOGAR
        private void chamaTelaLogado() {
            Intent itTelaLogado = new Intent(LoginActivity.this, TelaUsuarioActivity.class);

            Bundle parametros = new Bundle();
            parametros.putString("apelido", etApelido.getText().toString());
            itTelaLogado.putExtras(parametros);
            startActivity(itTelaLogado);
            finish();

        }

        /*
        private boolean verificaJaLogou() {
            boolean logou = false;
            String apelido = this.spLogin.getString("apelido", null);
            if(apelido!=null) {
                this.usuario.setApelido(apelido);
                logou = true;
            }
            return logou;
        }*/

        // CONSUMO DA AUTENTICAÇÃO
        private Usuario autenticacaoUsuario(String apelido, String senha) {
            this.uC.postAutentica(apelido, senha).enqueue(new Callback<Usuario>() {
                @Override
                public void onResponse(Call<Usuario> call, Response<Usuario> response) {

                    if(response.isSuccessful()) {
                        usuario = response.body();
                        editor.putString("apelido", usuario.getApelido());
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
                public void onFailure(Call<Usuario> call, Throwable t) {}
            });
            return usuario;
        }

    // INICIALIZAÇÃO DE COMPONENTES
    private void iniComps() {
        this.ivLogin = (ImageView)findViewById(R.id.iv_login);
        this.etApelido = (EditText)findViewById(R.id.et_apelido_l);
        this.etSenha = (EditText)findViewById(R.id.et_senha_l);
        this.btLogar = (Button)findViewById(R.id.bt_logar2);
        this.usuario = new Usuario();
        this.uC = new UsuarioConsumer();
        this.spLogin = getApplicationContext().getSharedPreferences(NOME_ARQUIVO,MODE_APPEND);
        this.editor = this.spLogin.edit();
    }

}



