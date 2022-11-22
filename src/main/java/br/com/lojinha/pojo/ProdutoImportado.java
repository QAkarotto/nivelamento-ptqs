package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.IFavorito;

public class ProdutoImportado extends Produto implements IFavorito {

    private double taxaImportacao;

    public ProdutoImportado(String marcaInicial, Tamanho tamanhoInicial, double taxaImportacao) {
        super(marcaInicial, tamanhoInicial);
        this.setTaxaImportacao(taxaImportacao);
    }

    public void setValor(double valor) {
        if (valor > -100) {
            this.valor = valor;

        } else {
            throw new IllegalArgumentException("Valor deve ser maior que -100");
        }
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {

        this.taxaImportacao = taxaImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
