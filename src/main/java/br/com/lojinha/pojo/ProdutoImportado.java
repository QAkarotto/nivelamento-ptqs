package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoImportado extends Produto{

    private double taxaImportacao;

    public ProdutoImportado(String marcaInicial, Tamanho tamanhoInicial, double taxaImportacao) {
        super(marcaInicial, tamanhoInicial);
        this.setTaxaImportacao(taxaImportacao );
    }

    public void setValor(double valor){
        if(valor > -100){
            this.valor = valor;

        }else{
            throw new IllegalArgumentException("Valor deve ser maior que -100");
        }
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
}
