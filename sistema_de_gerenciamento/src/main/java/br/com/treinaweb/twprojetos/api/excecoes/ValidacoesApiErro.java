package br.com.treinaweb.twprojetos.api.excecoes;

import java.time.LocalDateTime;
import java.util.List;

public class ValidacoesApiErro extends ApiErro {

    private List<CampoErro> erros;

    public ValidacoesApiErro() {}

    public ValidacoesApiErro(int erro, String status, LocalDateTime timestamp, String mensagem, List<CampoErro> erros) {
        super(erro, status, timestamp, mensagem);
        this.erros = erros;
    }

    public List<CampoErro> getErros() {
        return erros;
    }

    public void setErros(List<CampoErro> erros) {
        this.erros = erros;
    }
}
