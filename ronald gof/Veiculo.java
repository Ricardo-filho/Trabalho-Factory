public abstract class Veiculo {
    protected String modelo;
    protected String combustivel;
    protected int capacidadePassageiros;
    protected double precoPorDia;

    public abstract String getTipo();

    public double calcularAluguel(int dias) {
        return precoPorDia * dias;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo      : " + modelo);
        System.out.println("Categoria   : " + getTipo());
        System.out.println("Combustível : " + combustivel);
        System.out.println("Passageiros : " + capacidadePassageiros);
        System.out.println("Diária      : R$ " + precoPorDia);
    }
}