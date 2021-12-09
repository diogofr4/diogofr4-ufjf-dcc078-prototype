public class Rosto implements Cloneable{
    private Cabelo cabelo;
    private String formatoNariz;
    private String corOlhos;
    private String formatoBoca;
    private String formatoOrelha;

    public Rosto(Cabelo cabelo, String formatoNariz, String corOlhos, String formatoBoca, String formatoOrelha) {
        this.cabelo = cabelo;
        this.formatoNariz = formatoNariz;
        this.corOlhos = corOlhos;
        this.formatoBoca = formatoBoca;
        this.formatoOrelha = formatoOrelha;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public String getFormatoNariz() {
        return formatoNariz;
    }

    public void setFormatoNariz(String formatoNariz) {
        this.formatoNariz = formatoNariz;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getFormatoBoca() {
        return formatoBoca;
    }

    public void setFormatoBoca(String formatoBoca) {
        this.formatoBoca = formatoBoca;
    }

    public String getFormatoOrelha() {
        return formatoOrelha;
    }

    public void setFormatoOrelha(String formatoOrelha) {
        this.formatoOrelha = formatoOrelha;
    }

    @Override
    public Rosto clone() throws CloneNotSupportedException {
        Rosto rosto = (Rosto) super.clone();
        rosto.cabelo = rosto.cabelo.clone();

        return rosto;
    }

    @Override
    public String toString() {
        return "Rosto{" +
                cabelo.toString()  +
                ", formatoNariz='" + formatoNariz + '\'' +
                ", corOlhos='" + corOlhos + '\'' +
                ", formatoBoca='" + formatoBoca + '\'' +
                ", formatoOrelha='" + formatoOrelha + '\'' +
                '}';
    }
}
