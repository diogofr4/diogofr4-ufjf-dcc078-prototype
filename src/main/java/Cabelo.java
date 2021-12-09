public class Cabelo implements Cloneable{
    private String tipo;
    private String cor;

    public Cabelo(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Cabelo clone() throws CloneNotSupportedException {
        return (Cabelo) super.clone();
    }

    @Override
    public String toString() {
        return "Cabelo{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
