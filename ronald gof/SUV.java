public class SUV extends Veiculo {
    public SUV() {
        this.modelo                = "Jeep Commander";
        this.combustivel           = "Diesel";
        this.capacidadePassageiros = 7;
        this.precoPorDia           = 220.0;
    }

    @Override
    public String getTipo() { return "SUV"; }
}