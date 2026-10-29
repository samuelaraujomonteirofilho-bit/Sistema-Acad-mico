public class FachadaAcademica {
    private final ServicoMatricula servico;
    private final CriadorComprovante criador;

    public FachadaAcademica(
            ServicoMatricula servico,
            CriadorComprovante criador) {

        if (servico == null || criador == null) {
            throw new IllegalArgumentException(
                "Dependências inválidas"
            );
        }

        this.servico = servico;
        this.criador = criador;
    }

    public String matricularEEmitir(Aluno aluno, Curso curso) {
        double total = servico.matricular(aluno, curso);

        return criador.emitir(aluno, curso, total);
    }
}