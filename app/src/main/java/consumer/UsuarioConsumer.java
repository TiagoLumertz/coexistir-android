package consumer;

import java.util.ArrayList;
import java.util.List;

import pojo.Usuario;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by REMOR on 31/08/2017.
 */

public class UsuarioConsumer {
    // Polimorfismo
    List<Usuario> vetor = new ArrayList<Usuario>();

    private IUsuarioService usuarioService;
    private Retrofit retrofit;

    public UsuarioConsumer() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(IUsuarioService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.usuarioService = retrofit.create(IUsuarioService.class);
    }

    public Call<Usuario> postAutenticaUsuario(String login, String senha) {
        return this.usuarioService.postAutentica(login, senha);

    }

    public Call<Usuario> postCadastrarUsuario(Usuario usuario) {
        return this.usuarioService.postCadastrar(usuario);
    }


    public Call<Usuario> putAtualizarUsuario(Usuario usuario) {
        return this.usuarioService.putAtualizar(usuario);
    }

    public Call<List<Usuario>> buscarTodosUsuario() {
        return this.usuarioService.buscarTodos();
    }

    public Call<Void> deleteUsuarioPorId(long id) {
        return this.usuarioService.deletePorId(id);
    }








}
