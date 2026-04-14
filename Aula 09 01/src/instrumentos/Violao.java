package instrumentos;

public abstract class Violao implements Instrumento {
    protected String tipo;
    protected int cordas;
    protected String descricao;

    public Violao(String tipo, int cordas, String descricao) {
        this.tipo = tipo;
        this.cordas = cordas;
        this.descricao = descricao;
    }

    @Override
    public Instrumento clonar() {
        try {
            return (Instrumento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar violão");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("\n🎸 " + tipo + " 🎸");
        System.out.println("Cordas: " + cordas);
        System.out.println("Descrição: " + descricao);
    }
}