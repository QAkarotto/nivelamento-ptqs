package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto produto = new Produto("Goku", Tamanho.MÉDIO);
        produto.setNome("Play 4");
        produto.setValor(4999.90);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("1 cabo de energia");
        produto.setItensInclusos(itensInclusos);

        System.out.println(produto.getNome()+ ": " +produto.getMarca()+" , "+produto.getTamanho());
    }
}
