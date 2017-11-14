package consumer;

import pojo.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by REMOR on 31/08/2017.
 */

public interface IUsuarioService {
    static final String URL_BASE = "http://10.0.2.2:8080/mydb/usuario/";

    @POST("{apelido}/{senha}")
    Call<Usuario> postAutentica(@Path("apelido") String apelido, @Path("senha") String senha);

    @POST("")
    Call<Usuario> postCadastrar(@Body Usuario usuario);

    @PUT("{id}")
    Call<Usuario> putAtualizar(@Body Usuario usuario);

    // FALTA ESSE
    @DELETE("{id}")
    Call<Void> deletePorId(@Path("id")long id);

}