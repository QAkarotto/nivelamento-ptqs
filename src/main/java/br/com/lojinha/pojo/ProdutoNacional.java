package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoNacional extends Produto{

    private double impostoNacional;
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial, double impostoNacional) {
        super(marcaInicial, tamanhoInicial);
        this.setImpostoNacional(impostoNacional);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }
}
