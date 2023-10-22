package org.example.maratonajava.javacore.Kenum.test;

import org.example.maratonajava.javacore.Kenum.dominio.Cliente;
import org.example.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("joao kleber", TipoCliente.PJ, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("joao kleber", TipoCliente.PJ, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("joao kleber", TipoCliente.PF, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
