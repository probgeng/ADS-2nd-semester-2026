// Professor herda (extends) tudo que Pessoa tem: nome, CPF, genero
public class Professor extends Pessoa {
    private String materia;
    private String setorArea;

    public Professor(String nome, int CPF, String genero, String materia, String setorArea) {
        super(nome, CPF, genero); // chama o construtor de Pessoa
        this.materia   = materia;
        this.setorArea = setorArea;
    }

    // Professor corrige a prova e lança a nota no objeto Estudante
    public void corrigirProva(Estudante e, float nota) {
        System.out.println(getNome() + " corrigindo prova de " + e.getNome() + "...");
        e.setNota(nota); // usa a porta pública de Estudante
    }

    // Retorna true se conseguiu lançar presença, false se falhou
    public boolean lancarPresencial() {
        System.out.println("Presença lançada por " + getNome() + " na matéria " + materia);
        return true;
    }

    public String getMateria() {
        return materia;
    }

    public String getSetorArea() {
        return setorArea;
    }
}
