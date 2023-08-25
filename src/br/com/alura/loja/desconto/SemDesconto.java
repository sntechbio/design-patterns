package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import sun.security.krb5.internal.crypto.Des;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }


    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
