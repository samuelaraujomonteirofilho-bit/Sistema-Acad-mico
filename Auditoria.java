public class Auditoria implements ObservadorMatricula {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Auditoria: " + mensagem);
    }
}