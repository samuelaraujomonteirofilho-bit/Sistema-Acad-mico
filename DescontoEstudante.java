public class DescontoEstudante implements Desconto {
    @Override
    public double aplicar(double valor) {
        return valor * 0.90;
    }
}