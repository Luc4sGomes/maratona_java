package org.example.maratonajava.introduction;

public class Aula02Casting {
    //no java, é possivel atribuir um valor de um tipo de variavel a outro tipo de variavel porem,
    // para isso é necessario que a operacao seja apontada ao compilador
    // a este apontamento, damos o nome de casting

    //exemplos de conversão:


    //convertendo de double para inteiro
    int numConverted = (int) 12345.56;

    //para fazermos o casting, basta sinarlizamos o tipo para qual se deseja converter entre parenteses


    //convertendo um double para float
    float a = (float) 5.0;

    //conversao de char para int é implicito, nao precisa de casting
    int d = 'd';

    //obs: o unico tipo que nao suporta casting é o boolean
}
