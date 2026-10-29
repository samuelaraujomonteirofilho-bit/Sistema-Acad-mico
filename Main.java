public class Main {
    public static void main(String[] args) {

        // Singleton
        System.out.println(
            Configuracao.getInstancia().getNome()
        );

        // Criação dos objetos
        Aluno aluno = new Aluno("Ana");
        Curso curso = new Curso("Java", 200.00);

        // Strategy + Adapter
        Desconto desconto = new DescontoEstudante();

        RegistradorPagamento pagamento =
            new AdaptadorPagamento(new SistemaLegado());

        // Serviço de matrícula
        ServicoMatricula servico =
            new ServicoMatricula(desconto, pagamento);

        // Observer
        servico.inscrever(new AvisoEmail());
        servico.inscrever(new Auditoria());

        // Factory Method + Facade
        CriadorComprovante criador = new CriadorTexto();

        FachadaAcademica fachada =
            new FachadaAcademica(servico, criador);

        // Realização da matrícula e emissão do comprovante
        String comprovante =
            fachada.matricularEEmitir(aluno, curso);

        System.out.println(comprovante);

        System.out.println(
            "Cursos do aluno: " + aluno.getQuantidadeCursos()
        );
    }
}