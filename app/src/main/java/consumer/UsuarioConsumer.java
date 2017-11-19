package consumer;

import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsuarioConsumer {

    private IUsuarioService uS;
    private Retrofit retrofit;

    public UsuarioConsumer() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(IUsuarioService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.uS = retrofit.create(IUsuarioService.class);
    }

    public Call<Usuario> postAutentica(String apelido, String senha) { return this.uS.postAutentica(apelido, senha); }

    public Call<Usuario> postCadastrar(Usuario u) { return this.uS.postCadastrar(u); }

    public Call<Usuario> putAtualizar(Usuario u) { return this.uS.putAtualizar(u); }

    public Call<Void> deletePorId(long idUsuario) { return this.uS.deletePorId(idUsuario); }

}
