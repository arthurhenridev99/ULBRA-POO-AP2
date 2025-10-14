package ap2.ulbra.academy.domain;

public class Carro extends Veiculo{
    public int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void informacoesVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + getAno());
        System.out.println("Número de portas: " + numeroPortas);
    }
}
