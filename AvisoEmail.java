public class AvisoEmail implements ObservadorMatricula {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("E-mail: " + mensagem);
    }
}