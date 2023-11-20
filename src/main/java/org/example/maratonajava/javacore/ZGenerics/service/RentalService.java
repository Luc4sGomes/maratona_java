package org.example.maratonajava.javacore.ZGenerics.service;


import java.util.List;

public class RentalService<T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }


    public T buscarObjetoDisponivel() {
        System.out.println("Buscando Objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando Objeto: " + t);
        System.out.println("carros disponiveis para alugar: " + objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo carro" + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar: " + objetosDisponiveis);
    }
}
