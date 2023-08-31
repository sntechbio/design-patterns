package br.com.alura.loja;

import br.com.alura.loja.http.HttpAdapterImpl;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdpater {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new HttpAdapterImpl());
        registroDeOrcamento.registrar(orcamento);
    }

}
