package consumer;

import pojo.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface IUsuarioService {
    static final String URL_BASE = "http://localhost:3306/mydb/";

    @POST("usuario/{apelido}/{senha}")
    Call<Usuario> postAutentica(@Path("apelido") String apelido, @Path("senha") String senha);

    @POST("usuario/")
    Call<Usuario> postCadastrar(@Body Usuario usuario);

    @PUT("usuario/{id}")
    Call<Usuario> putAtualizar(@Body Usuario usuario);

    @DELETE("usuario/{id}")
    Call<Void> deletePorId(@Path("id") long id);

}