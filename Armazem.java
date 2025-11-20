import java.util.*;

public class Armazem {

    // Estrutura multinível:
    // nivel → corredor → prateleira → lista de códigos
    private Map<String, Map<String, Map<String, List<String>>>> estrutura;

    // Mapa auxiliar: código → localização
    private Map<String, ProdutoLocalizacao> indexProdutos;

    public Armazem() {
        estrutura = new HashMap<>();
        indexProdutos = new HashMap<>();
    }

    // Cadastrar produto e sua localização
    public void adicionarProduto(String codigo, String nivel, String corredor, String prateleira) {

        // Atualiza mapa multinível
        estrutura
            .computeIfAbsent(nivel, n -> new HashMap<>())
            .computeIfAbsent(corredor, c -> new HashMap<>())
            .computeIfAbsent(prateleira, p -> new ArrayList<>())
            .add(codigo);

        // Atualiza índice auxiliar
        indexProdutos.put(codigo, new ProdutoLocalizacao(nivel, corredor, prateleira));
    }

    // Buscar localização pelo código de barras
    public ProdutoLocalizacao buscarProduto(String codigo) {
        return indexProdutos.get(codigo);
    }

    // Mostrar tudo
    public void exibirEstrutura() {
        System.out.println("\n=== ARMAZÉM COMPLETO ===");
        for (var nivel : estrutura.keySet()) {
            System.out.println("Nível: " + nivel);
            for (var corredor : estrutura.get(nivel).keySet()) {
                System.out.println("  Corredor: " + corredor);
                for (var prateleira : estrutura.get(nivel).get(corredor).keySet()) {
                    System.out.println("    Prateleira: " + prateleira +
                        " → Produtos: " + estrutura.get(nivel).get(corredor).get(prateleira));
                }
            }
        }
    }
}
