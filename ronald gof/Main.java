import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     ALUGUEL DE CARROS 🚗     ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println();
        System.out.println("Escolha a categoria:");
        System.out.println("  1 - Econômico     (VW Gol)          R$ 80/dia");
        System.out.println("  2 - Intermediário (Toyota Corolla)  R$ 150/dia");
        System.out.println("  3 - Luxo          (BMW Série 5)     R$ 350/dia");
        System.out.println("  4 - SUV           (Jeep Commander)  R$ 220/dia");
        System.out.println();
        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Quantos dias de aluguel? ");
        int dias = scanner.nextInt();

        System.out.print("Nome do cliente: ");
        scanner.nextLine();
        String cliente = scanner.nextLine();

        try {
            Veiculo veiculo = VeiculoFactory.criar(opcao);

            System.out.println();
            System.out.println("══════════════════════════════════");
            System.out.println("         DETALHES DO VEÍCULO      ");
            System.out.println("══════════════════════════════════");
            veiculo.exibirDetalhes();
            System.out.println("══════════════════════════════════");
            System.out.println("         RESUMO DO ALUGUEL        ");
            System.out.println("══════════════════════════════════");
            System.out.println("Cliente : " + cliente);
            System.out.println("Dias    : " + dias);
            System.out.println("──────────────────────────────────");
            System.out.printf("TOTAL   : R$ %.2f%n", veiculo.calcularAluguel(dias));
            System.out.println("══════════════════════════════════");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}