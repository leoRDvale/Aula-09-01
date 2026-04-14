package instrumentos;

public interface Instrumento extends Cloneable {
    Instrumento clonar();
    void exibirInfo();
}