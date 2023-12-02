package org.example.maratonajava.javacore.ZZCLambdas.domain;

import org.example.maratonajava.javacore.Ycollections.domain.Pessoa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GrupoPessoas {
    public static void main(String[] args) {

        //o java 8 trouxe algumas novas funcionalidades, dentre elas lambdas e method reference,
        // tanto lambdas quanto metodos reference tem o objetivo de diminuir o codigo escrito e
        // com uma abordagem mais funcional;

        //no exemplo abaixo, mostramos o uso das 2 features, suponhamos que temos uma lista de nomes e
        //que gostariamos de imprimir seu conteudo. Antes do lambda e do method reference seria assim:

        List<String> peopleNames = Arrays.asList("Lucas Gomes", "Luiz Melo", "Alzineide Gomes");

        //para imprimir cada nome da lista, teriamos que iterar sobre ela com o forEach logo abaixo
        for (String name : peopleNames
        ) {
            System.out.println(name);
        }

        System.out.println("- - - - - - ");


        //porém, com lambdas ficaria asssim -> "dando um forEach na minha lista e pra cada nome imprima-o
        peopleNames.forEach(name -> System.out.println(name));


        //com method reference ficaria mais facil, note que acima ainda tem um "warning", dizendo que o codigo
        //pode ser melhorado:
        System.out.println("- - - - - - ");

        //usando method reference ->
        peopleNames.forEach(System.out::println);

        System.out.println("- - - - - - ");
        //em todos os casos acima, temos a mesma saida: Lucas Gomes, Luiz Melo, Alzineide Gomes


        //PORÉM, QUAL A REAL DIFERENCA ENTRE ESSAS ABORDAGENS?
        //R: depende, vai depender do caso, nenhuma delas é a melhor solução para todos os casos

        //é importante ressaltar que nem sempre é possivel substituir uma lambda por um m::reference
        //é necessario que a invocação do metodo da direta receba os mesmos paramentros da esquerda do lambda


        //no ex abaixo temos a nossa lista de nomes e queremos criar uma nova lista apenas com as primeiras 3 letras de cada nome


        List<String> peopleNames2 = Arrays.asList("Lucas", "Luiz", "Neide");
        List<String> peopleNamesCaracterInitials = peopleNames2.stream().map(name -> name.substring(0, 3)).collect(Collectors.toList());
        System.out.println(peopleNames2);
        System.out.println(peopleNamesCaracterInitials);

        //neste caso nao seria possivel usar, m::reference, pois uma faz para chamar o metodo substring seria necessario passar um parametro externo, os numers 0 e 3

        //Vantagens de se Utilizar m::reference: 1. Usa menos simbolos, dito isso facilita a legibilidade do codigo 2. facilita de se entender o que acontece
        //uma vez que o tipo do objeto fica sempre muito explicito

        //Ex: suponhamos que temos uma classe Pessoa, e essa classe possui o metodo getName() da pessoa, utlizando lambda ficaria algo do tipo:
        //p -> p.getName();

        //veja que é necessario entender qual o contexto para poder entender o que é *p* enquanto com m::reference ficaria algo como:
        Function<Pessoa, String> getNome = Pessoa::getNome;
        //Pessoa::getNome

        //fica bem mais facil de identificar o elemento que esta sendo manipulado, esta explicito!


        //Outros usos do method reference: o m::reference tambem funciona em metodos que recebem mais de um parametro, contanto que a quantidade seja a mesma
        //que a de atributo do objeto que estamos usando

        //imagine que temos um mapa de alunos e sua nota, e gostariamos de passar isso para outro mapa, usando lambda nosso codigo ficaria assim:
        Map<String, Integer> notasAlunos = new HashMap<String, Integer>();
        notasAlunos.put("Lucas", 10);
        notasAlunos.put("Carlos", 8);
        notasAlunos.put("Larissa", 5);

        System.out.println(notasAlunos);
        System.out.println("- - - - - - -");

        Map<String, Integer> novoMapaNotas = new HashMap<String, Integer>();
        notasAlunos.forEach((nome, nota) -> novoMapaNotas.put(nome, nota));

        System.out.println(novoMapaNotas);
        System.out.println("- - - - - - -");

        //veja que o lado esquerdo da expessao lambda recebe 2 parametros, nome e nota. O lado direto também recebe estes parametros na mesma ordem. que tal usar m::reference entao?

        Map<String, Integer> novoMapaNotasReference = new HashMap<String, Integer>();
        notasAlunos.forEach(novoMapaNotasReference::put);

        System.out.println(novoMapaNotasReference);
        System.out.println("- - - - - - -");


    }
}
