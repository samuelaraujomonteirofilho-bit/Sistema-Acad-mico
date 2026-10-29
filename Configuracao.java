public final class Configuracao {
    private static final Configuracao INSTANCIA =
        new Configuracao();

    private final String nome = "Sistema Acadêmico";

    private Configuracao() {
    }

    public static Configuracao getInstancia() {
        return INSTANCIA;
    }

    public String getNome() {
        return nome;
    }
}