package org.example.maratonajava.javacore.ZGenerics.test;

import org.example.maratonajava.javacore.ZGenerics.domain.Caixa;

import java.util.List;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaString = new Caixa<>("OI, eu sou uma caixa :)");
        Caixa<Integer> integerCaixa = new Caixa<>(1);

        String conteudo = caixaString.getConteudo();
        Integer conteudoInteger = integerCaixa.getConteudo();

        System.out.println(conteudo);
        System.out.println(conteudoInteger);

//        integerCaixa.obterPrimeiroElemento();
    }

    public  void imprime(List<?> list) {
        for (Object item: list
             ) {
            System.out.println(item);
        }
    }
}
