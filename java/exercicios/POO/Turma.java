import java.util.ArrayList;

// Turma agrupa um Professor e vários Estudantes
public class Turma {
    private String nomeMateria;
    private float horario;
    private Professor professor;
    private ArrayList<Estudante> estudantes;

    public Turma(String nomeMateria, float horario, Professor professor) {
        this.nomeMateria = nomeMateria;
        this.horario     = horario;
        this.professor   = professor;
        this.estudantes  = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante e) {
        estudantes.add(e);
        System.out.println(e.getNome() + " adicionado(a) à turma " + nomeMateria);
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public float getHorario() {
        return horario;
    }

    public Professor getProfessor() {
        return professor;
    }
}
