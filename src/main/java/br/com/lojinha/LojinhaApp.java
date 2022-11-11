package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

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

        System.out.println(produto.getNome()+ "\n" +produto.getMarca()+ "\n" + produto.getTamanho() + "\n" + produto.getItensInclusos());
    }
}
