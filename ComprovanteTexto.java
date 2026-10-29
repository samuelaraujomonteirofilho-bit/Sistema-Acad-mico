public class ComprovanteTexto implements Comprovante {
    @Override
    public String gerar(
            Aluno aluno, Curso curso, double valor) {

        return "Matrícula: " + aluno.getNome()
            + " / " + curso.getTitulo()
            + " / R$ " + String.format(
                java.util.Locale.forLanguageTag("pt-BR"),
                "%.2f", valor
            );
    }
}