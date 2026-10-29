public class CriadorTexto extends CriadorComprovante {
    @Override
    public Comprovante criar() {
        return new ComprovanteTexto();
    }
}