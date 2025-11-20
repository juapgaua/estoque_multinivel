import java.util.Scanner;

public class Menu {

    private Armazem armazem;
    private Scanner sc;

    public Menu() {
        armazem = new Armazem();
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao = 0;

        do {
            System.out.println("\n===== SISTEMA DE LOCALIZAÇÃO DE PRODUTOS =====");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Buscar produto por código");
            System.out.println("3. Exibir estrutura completa");
            System.out.println("4. Sair");
            System.out.print("Digite sua opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> buscar();
                case 3 -> armazem.exibirEstrutura();
                case 4 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 4);
    }

    private void cadastrar() {
        System.out.print("Código de barras: ");
        String codigo = sc.nextLine();

        System.out.print("Nível: ");
        String nivel = sc.nextLine();

        System.out.print("Corredor: ");
        String corredor = sc.nextLine();

        System.out.print("Prateleira: ");
        String prateleira = sc.nextLine();

        armazem.adicionarProduto(codigo, nivel, corredor, prateleira);

        System.out.println("Produto cadastrado com sucesso!");
    }

    private void buscar() {
        System.out.print("Informe o código de barras: ");
        String codigo = sc.nextLine();

        ProdutoLocalizacao loc = armazem.buscarProduto(codigo);

        if (loc != null) {
            System.out.println("Localização encontrada: " + loc);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
