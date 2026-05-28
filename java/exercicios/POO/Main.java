public class Main {
    public static void main(String[] args) {

        // Criando o professor
        Professor prof = new Professor("Carlos Silva", 12345678, "M", "POO", "TI");

        // Criando estudantes
        Estudante aluno1 = new Estudante("Luiz",  98765432, "M", "ADS2024-01");
        Estudante aluno2 = new Estudante("Maria", 11223344, "F", "ADS2024-02");

        // Criando a turma e adicionando os alunos
        Turma turma = new Turma("Projeto e Engenharia de Software", 19.0f, prof);
        turma.adicionarEstudante(aluno1);
        turma.adicionarEstudante(aluno2);

        System.out.println();

        // Professor corrige provas e lança notas
        prof.corrigirProva(aluno1, 8.5f);
        prof.corrigirProva(aluno1, 7.0f);
        prof.corrigirProva(aluno2, 9.0f);
        prof.corrigirProva(aluno2, 15.0f); // inválida

        System.out.println();

        // Professor lança presença
        prof.lancarPresencial();

        System.out.println();

        // Exibindo médias
        System.out.println("Média de " + aluno1.getNome() + ": " + aluno1.calcularMedia());
        System.out.println("Média de " + aluno2.getNome() + ": " + aluno2.calcularMedia());
    }
}
