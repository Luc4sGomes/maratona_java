package org.example.maratonajava.javacore.ZGenerics.test;

import org.example.maratonajava.javacore.ZGenerics.domain.Barco;
import org.example.maratonajava.javacore.ZGenerics.domain.Carro;
import org.example.maratonajava.javacore.ZGenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Mercedes"), new Carro("BMW")));
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("iate")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("usando o carro por um mes...");
        rentalService.retornarObjetoAlugado(carro);


        System.out.println("- - - - - - ");


        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoList);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("usando o barco por um mes...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
