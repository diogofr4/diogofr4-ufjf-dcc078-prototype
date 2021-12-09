public class Pessoa implements Cloneable{
    private String nome;
    private String altura;
    private String cor;
    private String nacionalidade;
    private Rosto rosto;
    private int cloneCount;

    public Pessoa(String nome, String altura, String cor, String nacionalidade, Rosto rosto) {
        this.nome = nome;
        this.altura = altura;
        this.cor = cor;
        this.nacionalidade = nacionalidade;
        this.rosto = rosto;
        this.cloneCount = 0;
    }

    public int getCloneCount() {
        return cloneCount;
    }

    public void setCloneCount(int cloneCount) {
        this.cloneCount = cloneCount;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Rosto getRosto() {
        return rosto;
    }

    public void setRosto(Rosto rosto) {
        this.rosto = rosto;
    }

    @Override
    protected Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoa = (Pessoa) super.clone();
        pessoa.rosto = pessoa.rosto.clone();
        cloneCount++;

        return pessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura='" + altura + '\'' +
                ", cor='" + cor + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", " + rosto.toString() +
                ", cloneCount=" + cloneCount +
                '}';
    }
}
