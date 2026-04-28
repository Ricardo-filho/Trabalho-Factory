public class Luxo extends Veiculo {
    public Luxo() {
        this.modelo                = "BMW Série 5";
        this.combustivel           = "Gasolina";
        this.capacidadePassageiros = 5;
        this.precoPorDia           = 350.0;
    }

    @Override
    public String getTipo() { return "Luxo"; }
}