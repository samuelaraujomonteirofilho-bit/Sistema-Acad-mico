import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String nome;
    private final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso inválido");
        }

        cursos.add(curso);
    }

    public int getQuantidadeCursos() {
        return cursos.size();
    }
}