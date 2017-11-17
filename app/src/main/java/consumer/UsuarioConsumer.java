package consumer;

import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class UsuarioConsumer {

    private IUsuarioService usuarioService;
    private Retrofit retrofit;

    public UsuarioConsumer() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(IUsuarioService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.usuarioService = retrofit.create(IUsuarioService.class);
    }

    public Call<Usuario> postAutentica(String login, String senha) { return this.usuarioService.postAutentica(login, senha); }

    public Call<Usuario> postCadastrar(Usuario usuario) { return this.usuarioService.postCadastrar(usuario); }

    public Call<Usuario> putAtualizar(Usuario usuario) { return this.usuarioService.putAtualizar(usuario); }

    public Call<Void> deletePorId(long idUsuario) { return this.usuarioService.deletePorId(idUsuario); }

}
