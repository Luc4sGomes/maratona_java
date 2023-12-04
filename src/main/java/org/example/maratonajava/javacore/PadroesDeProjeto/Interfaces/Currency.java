package org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces;

public interface Currency {
    String getSimbol();
}

class Real implements Currency {

    @Override
    public String getSimbol() {
        return "R$";
    }
}


class UsDollar implements Currency {

    @Override
    public String getSimbol() {
        return "$";
    }
}
