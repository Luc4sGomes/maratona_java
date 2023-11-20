package org.example.maratonajava.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("carro");
        fila.add("moto");
        fila.add("motocicleta");
        fila.add("trator");

        while(fila.isEmpty()){
            System.out.println(fila.peek());
        }

        for (String veiculo : fila
        ) {
            System.out.println(veiculo);
        }

        System.out.println(fila);

    }
}
