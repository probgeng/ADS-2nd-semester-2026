import java.util.ArrayList;

// Estudante herda (extends) tudo que Pessoa tem: nome, CPF, genero
public class Estudante extends Pessoa {
    private String matricula;
    private ArrayList<Float> notas;

    public Estudante(String nome, int CPF, String genero, String matricula) {
        super(nome, CPF, genero); // chama o construtor de Pessoa
        this.matricula = matricula;
        this.notas     = new ArrayList<>();
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // setNota = addNota do UML anterior — adiciona com validação
    public void setNota(float nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida: " + nota + " (deve ser entre 0 e 10)");
        }
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        float soma = 0;
        for (float n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }
}
