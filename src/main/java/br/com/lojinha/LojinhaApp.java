package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Play 4";
        produto.valor = 4999.99;
        produto.marca = "Sony";
        produto.tamanho = "Médio";
        produto.itensInclusos = "2 controle e 3 jogos";

        System.out.println(produto.nome);
    }
}
