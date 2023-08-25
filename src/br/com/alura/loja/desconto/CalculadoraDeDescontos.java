package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import sun.security.krb5.internal.crypto.Des;

import java.math.BigDecimal;
import java.util.Objects;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoValorMaiorQueQuientos(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }

}
