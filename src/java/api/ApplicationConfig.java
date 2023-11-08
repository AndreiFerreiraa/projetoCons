package api;

import api.Entity.Carro;
import java.util.ArrayList;
import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {
    //FAKE DB
    public static ArrayList<Carro> lista = new ArrayList<>();

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(api.Services.CarroService.class);
        resources.add(api.Utils.CORSFilter.class);
    }
    
}
