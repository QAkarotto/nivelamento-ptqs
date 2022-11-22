package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.IFavorito;

public class ProdutoNacional extends Produto implements IFavorito {

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

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
