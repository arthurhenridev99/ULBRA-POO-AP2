package ap2.ulbra.academy.domain;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void informacoesVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
