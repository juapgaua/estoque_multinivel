// Classe simples que representa a localização de um produto no armazém
public class ProdutoLocalizacao {

    private String nivel;
    private String corredor;
    private String prateleira;

    public ProdutoLocalizacao(String nivel, String corredor, String prateleira) {
        this.nivel = nivel;
        this.corredor = corredor;
        this.prateleira = prateleira;
    }

    // Getters
    public String getNivel() { return nivel; }
    public String getCorredor() { return corredor; }
    public String getPrateleira() { return prateleira; }

    @Override
    public String toString() {
        return "Nível: " + nivel + ", Corredor: " + corredor + ", Prateleira: " + prateleira;
    }
}
