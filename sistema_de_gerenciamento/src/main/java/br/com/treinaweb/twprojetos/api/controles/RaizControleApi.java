package br.com.treinaweb.twprojetos.api.controles;

import br.com.treinaweb.twprojetos.api.hateoas.RaizModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/v1")
public class RaizControleApi {

    @GetMapping
    public RaizModel raiz() {
        RaizModel raizModel = new RaizModel();

        Link Cargoslink = linkTo(methodOn(CargoControleApi.class).buscarTodos(null))
                .withRel("cargos")
                .withType("GET");

        raizModel.add(Cargoslink);

        return raizModel;

    }
}
