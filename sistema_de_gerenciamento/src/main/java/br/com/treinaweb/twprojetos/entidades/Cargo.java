package br.com.treinaweb.twprojetos.entidades;

import org.springframework.hateoas.server.core.Relation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Relation(collectionRelation = "cargos")
public class Cargo extends Entidade {

    @NotNull
    @Size(min = 3, max = 40)
    @Column(nullable = false, length = 40, unique = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
