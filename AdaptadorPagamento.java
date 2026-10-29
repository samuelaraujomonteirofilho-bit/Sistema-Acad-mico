public class AdaptadorPagamento
        implements RegistradorPagamento {

    private final SistemaLegado legado;

    public AdaptadorPagamento(SistemaLegado legado) {
        if (legado == null) {
            throw new IllegalArgumentException(
                "Sistema legado inválido"
            );
        }

        this.legado = legado;
    }

    @Override
    public void registrar(double reais) {
        if (!Double.isFinite(reais) || reais < 0) {
            throw new IllegalArgumentException(
                "Valor de pagamento inválido"
            );
        }

        int centavos = Math.toIntExact(
            Math.round(reais * 100)
        );

        legado.registrarEmCentavos(centavos);
    }
}