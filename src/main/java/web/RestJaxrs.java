package web;

import entities.Compte;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CompteRepository;

import java.util.List;

@Component
@Path("/banque")
public class RestJaxrs {
    @Autowired
    private CompteRepository cmt_rep;

    @GET
    @Path("/comptes")
    @Transactional
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> comptelist(){
        return cmt_rep.findAll();
    }
}