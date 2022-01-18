package br.com.treinaweb.twprojetos.api.hateoas;

import br.com.treinaweb.twprojetos.api.controles.CargoControleApi;
import br.com.treinaweb.twprojetos.entidades.Cargo;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class CargoAssembler implements SimpleRepresentationModelAssembler<Cargo> {

    @Override
    public void addLinks(EntityModel<Cargo> resource) {
        Long id = resource.getContent().getId();

        Link selflink = linkTo(methodOn(CargoControleApi.class).buscarPorId(id))
                .withSelfRel()
                .withType("GET");

        Link editarlink = linkTo(methodOn(CargoControleApi.class).atualizar(null, id))
                .withSelfRel()
                .withType("PUT");

        Link excluirlink = linkTo(methodOn(CargoControleApi.class).excluirPorId(id))
                .withSelfRel()
                .withType("DELETE");

        resource.add(selflink, editarlink, excluirlink);

    }

    @Override
    public void addLinks(CollectionModel<EntityModel<Cargo>> resources) {
        Link cadastrolink = linkTo(methodOn(CargoControleApi.class).cadastrar(null))
                .withSelfRel()
                .withType("POST");

        Link selflink = linkTo(methodOn(CargoControleApi.class).buscarTodos(null))
                .withSelfRel()
                .withType("GET");

        resources.add(selflink, cadastrolink);
    }
}
