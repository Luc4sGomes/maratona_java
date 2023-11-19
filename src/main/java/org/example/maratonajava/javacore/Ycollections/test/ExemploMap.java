package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapaPessoas = new HashMap<>();

        Pessoa pessoaDucarmo = new Pessoa("Durcamo santos medeiro", 2L);
        Pessoa pessoaZeca = new Pessoa("Zeca maranhão da vila", 3L);


        mapaPessoas.put(pessoaDucarmo.getId(), pessoaDucarmo);
        mapaPessoas.put(pessoaZeca.getId(), pessoaZeca);

        for (Pessoa pessoa: mapaPessoas.values()
             ){
            System.out.println(mapaPessoas.get(2L));
        }


    }
}
