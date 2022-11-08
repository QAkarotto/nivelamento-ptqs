package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Play 4");
        produto.setValor(4999.99);
        produto.setMarca("Sony");
        produto.setTamanho("Médio");
        produto.setItensInclusos("2 controle e 3 jogos");

        System.out.println(produto.getValor());
    }
}
