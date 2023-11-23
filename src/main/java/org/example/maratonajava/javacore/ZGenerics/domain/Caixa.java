package org.example.maratonajava.javacore.ZGenerics.domain;


import java.util.List;
import java.util.NoSuchElementException;

public class Caixa<T> {

    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public <T> T obterPrimeiroElemento(List<T> list) {
        if (list.isEmpty())
            throw new NoSuchElementException("Lista vazia");
        return list.get(0);
    }

}
