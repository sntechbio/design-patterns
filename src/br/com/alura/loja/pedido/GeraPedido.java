package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;

    private BigDecimal valorOrcamento;

    private int quantidadeItems;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItems) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItems = quantidadeItems;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public void setQuantidadeItems(int quantidadeItems) {
        this.quantidadeItems = quantidadeItems;
    }
}
