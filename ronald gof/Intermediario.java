public class Intermediario extends Veiculo {
    public Intermediario() {
        this.modelo                = "Toyota Corolla";
        this.combustivel           = "Híbrido";
        this.capacidadePassageiros = 5;
        this.precoPorDia           = 150.0;
    }

    @Override
    public String getTipo() { return "Intermediário"; }
}