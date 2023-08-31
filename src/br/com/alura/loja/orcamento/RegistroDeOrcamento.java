package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {

        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");
        }

        Map<String, Object> dados = new HashMap<>();
        dados.put("valor", orcamento.getValor());
        dados.put("quantidadeItens", orcamento.getQuantidadeItens());

        String url = "url";
        httpAdapter.post(url, dados);
    }

}
