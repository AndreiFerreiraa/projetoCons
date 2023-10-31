package api.Services;

import api.ApplicationConfig;
import api.Entity.Carro;
import com.google.gson.Gson;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("carro")
public class CarroService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarVeiculo(JsonObject body) {
        // CAPTURA INFORMAÇÕES DO CORPO DA REQUISIÇÃO
        String modelo = body.getString("modelo");
        String renaven = body.getString("renavan");
        String cor = body.getString("cor");
        int ano = body.getInt("ano");
        double preco = body.getJsonNumber("preco").doubleValue();
        String photo = body.getString("photo");
        boolean vendido = body.getBoolean("vendido");
        
        // CRIANDO CARRO COM INFORMAÇÕES QUE VIERAM DA REQUISIÇÃO
        Carro c = new Carro(modelo, renaven, cor, ano, preco, photo, vendido);
        
        //CADASTRA NO BANCO DE DADOS (FAKE)
        ApplicationConfig.lista.add(c);
        
        // RETORNA A RESPOSTA PARA O FRONT
        return Response.status(201).entity(new Gson().toJson(c)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarTodosVeiculos() {
       return Response.status(200).entity(new Gson().toJson(ApplicationConfig.lista)).build();
    }

}
