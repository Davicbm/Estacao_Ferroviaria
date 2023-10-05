public class Locomotiva {
    private int capacidadeTracao;
    private String numeroSerie;
    private int comprimento;

    public Locomotiva(String numeroSerie, int comprimento, int capacidadeTracao) {
        this.numeroSerie = numeroSerie;
        this.comprimento = comprimento;
        this.capacidadeTracao = capacidadeTracao;
    }

    public String toString() {
        return "- Locomotiva : Capacidade de Tração = " + capacidadeTracao + ", Comprimento = " + comprimento + 
        ", Numero de Série = " + numeroSerie;
    }
    public String toString2(){
        return "    - Locomotiva do Trem: Capacidade de Tração = " + capacidadeTracao + ", Comprimento = " + comprimento + 
        ", Numero de Série = " + numeroSerie;
    }
    public String getNumeroString() {
        return this.numeroSerie;
    }
    public float getComprimento() {
        return this.comprimento;
    }
    public float getCapacidadeTracao() {
        return this.capacidadeTracao;
    }

    public void setCapacidadeTracao(int capacidadeTracao) {
        this.capacidadeTracao = capacidadeTracao;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}