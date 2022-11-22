package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoImportado;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto produto = new Produto("Goku", Tamanho.MÉDIO);
        produto.setNome("Play 4");
        produto.setValor(4999.90);

        List<ItemIncluso> itensInclusos = new ArrayList<>();
        itensInclusos.add(new ItemIncluso("Controle", 2));
        itensInclusos.add(new ItemIncluso("Jogo", 3));
        itensInclusos.add(new ItemIncluso("Cabo de energia", 1));
        produto.setItensInclusos(itensInclusos);

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : produto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens");

        ProdutoImportado produtoImportado = new ProdutoImportado("Nike", Tamanho.GRANDE, 0.55);
        produtoImportado.setValor(-99.99);
    }
}
