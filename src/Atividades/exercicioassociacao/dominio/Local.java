package Atividades.exercicioassociacao.dominio;

public class Local {
    private String endereco;

    // Construtor
    public Local(String endereco) {
        this.endereco = endereco;
    }

    // getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
