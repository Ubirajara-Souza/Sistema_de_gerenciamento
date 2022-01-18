package br.com.treinaweb.twprojetos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

import javax.persistence.*;

@Entity
@Relation(collectionRelation = "clientes")
public class Cliente extends Pessoa {

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Projeto> projetos;

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    
}
