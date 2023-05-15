
public abstract class ElementoVisual {
    protected String nome;

    public ElementoVisual(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibir();
}
