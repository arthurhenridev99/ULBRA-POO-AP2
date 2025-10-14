package ap2.ulbra.academy.test;

import ap2.ulbra.academy.domain.Carro;
import ap2.ulbra.academy.domain.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.informacoesVeiculo();
        System.out.println("-------------------");
        moto.informacoesVeiculo();
    }
}