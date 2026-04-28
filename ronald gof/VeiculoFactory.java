public class VeiculoFactory {
    public static Veiculo criar(int opcao) {
        switch (opcao) {
            case 1: return new Economico();
            case 2: return new Intermediario();
            case 3: return new Luxo();
            case 4: return new SUV();
            default: throw new IllegalArgumentException("Opção inválida!");
        }
    }
}





