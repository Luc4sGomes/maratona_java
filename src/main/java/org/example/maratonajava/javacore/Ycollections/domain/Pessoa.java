package org.example.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private Long id;

    public Pessoa(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
