public class CriadorResumido extends CriadorComprovante {
    @Override
    public Comprovante criar() {
        return new ComprovanteResumido();
    }
}