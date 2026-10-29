public class Curso {
    private final String titulo;
    private final double preco;

    public Curso(String titulo, double preco) {
        if (titulo == null || titulo.isBlank()
                || !Double.isFinite(preco) || preco <= 0) {
            throw new IllegalArgumentException("Dados inválidos");
        }

        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }
}