public class Economico extends Veiculo {
    public Economico() {
        this.modelo                = "Volkswagen Gol";
        this.combustivel           = "Flex";
        this.capacidadePassageiros = 5;
        this.precoPorDia           = 80.0;
    }

    @Override
    public String getTipo() { return "Econômico"; }
}