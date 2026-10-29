import java.util.ArrayList;
import java.util.List;

public class ServicoMatricula {
    private final Desconto desconto;
    private final RegistradorPagamento pagamento;

    private final List<ObservadorMatricula> observadores =
        new ArrayList<>();

    public ServicoMatricula(
            Desconto desconto,
            RegistradorPagamento pagamento) {

        if (desconto == null || pagamento == null) {
            throw new IllegalArgumentException(
                "Dependências inválidas"
            );
        }

        this.desconto = desconto;
        this.pagamento = pagamento;
    }

    public void inscrever(ObservadorMatricula observador) {
        if (observador == null) {
            throw new IllegalArgumentException(
                "Observador inválido"
            );
        }

        observadores.add(observador);
    }

    public double matricular(Aluno aluno, Curso curso) {
        if (aluno == null || curso == null) {
            throw new IllegalArgumentException(
                "Aluno ou curso inválido"
            );
        }

        double total = desconto.aplicar(curso.getPreco());

        // Registra o pagamento antes de confirmar a matrícula.
        pagamento.registrar(total);

        aluno.adicionarCurso(curso);

        String mensagem = aluno.getNome()
            + " matriculado em " + curso.getTitulo();

        for (ObservadorMatricula observador : observadores) {
            observador.atualizar(mensagem);
        }

        return total;
    }
}