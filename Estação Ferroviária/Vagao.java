public class Vagao {
    private String numeroSerie;
    private String tipo;
    private int capacidadeCarga;
    private int comprimentoEngates;
    private int comprimentoTesteiras;

    public Vagao(String numeroSerie, String tipo, int capacidadeCarga, int comprimentoEngates, int comprimentoTesteiras){
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoEngates = comprimentoEngates;
        this.comprimentoTesteiras = comprimentoTesteiras;
    }

    public String toString(){
        return "- Vagão: " + "Número de Série = " + numeroSerie + ", Tipo = " + tipo + ", Capacidade de Carga = " 
        + capacidadeCarga + ", Comprimento Engates = " + comprimentoEngates + ", Comprimento Testeiras = " + comprimentoTesteiras;
    }
    public String toString2(){
        return "    - Vagão do Trem: " + "Número de Série = " + numeroSerie + ", Tipo = " + tipo + ", Capacidade de Carga = " 
        + capacidadeCarga + ", Comprimento Engates = " + comprimentoEngates + ", Comprimento Testeiras = " + comprimentoTesteiras;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getComprimentoEngates() {
        return comprimentoEngates;
    }
    public void setComprimentoEngates(int comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }
    
    public int getComprimentoEsteiras() {
        return comprimentoTesteiras;
    }
    public void setComprimentoEsteiras(int comprimentoEsteiras) {
        this.comprimentoTesteiras = comprimentoEsteiras;
    }

    public void setComprimentoTesteiras(int comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }

    public int getComprimentoTesteiras() {
        return comprimentoTesteiras;
    }
}
