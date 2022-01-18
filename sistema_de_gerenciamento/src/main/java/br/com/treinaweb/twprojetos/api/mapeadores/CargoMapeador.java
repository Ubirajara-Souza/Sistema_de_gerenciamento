package br.com.treinaweb.twprojetos.api.mapeadores;

import br.com.treinaweb.twprojetos.api.dto.CargoDTO;
import br.com.treinaweb.twprojetos.entidades.Cargo;
import org.springframework.stereotype.Component;

@Component
public class CargoMapeador {

    public Cargo converterParaEntidade(CargoDTO cargoDTO) {
        Cargo cargo = new Cargo();

        cargo.setNome(cargoDTO.getNome());

        return cargo;
    }
}
