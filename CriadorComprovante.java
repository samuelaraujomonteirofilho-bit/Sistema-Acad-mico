public abstract class CriadorComprovante {
    public abstract Comprovante criar();

    public String emitir(
            Aluno aluno, Curso curso, double valor) {

        return criar().gerar(aluno, curso, valor);
    }
}