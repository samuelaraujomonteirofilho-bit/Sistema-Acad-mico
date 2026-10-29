public class ComprovanteResumido implements Comprovante {
    @Override
    public String gerar(
            Aluno aluno, Curso curso, double valor) {

        return aluno.getNome() + " - R$ "
            + String.format(
                java.util.Locale.forLanguageTag("pt-BR"),
                "%.2f", valor
            );
    }
}