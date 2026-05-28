public class Pessoa {
    private String nome;
    private int CPF;
    private String genero;

    public Pessoa(String nome, int CPF, String genero) {
        this.nome   = nome;
        this.CPF    = CPF;
        this.genero = genero;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getGenero() {
        return genero;
    }
}
