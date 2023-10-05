import java.util.ArrayList;

public class EstacaoFerroviaria { 
    private String sigla;
    private String descricao;
    private ArrayList<LinhaFerroviaria> linhas = new ArrayList<LinhaFerroviaria>();

    public EstacaoFerroviaria(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public void adicionarLinhas (LinhaFerroviaria linha){
        linhas.add(linha);
        System.out.println("Linha adicionada à estação");
    }

    public String toString(){
        return "* Estação: " + "Sigla = " + sigla + ", Descrição = " + descricao + "\n";
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<LinhaFerroviaria> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<LinhaFerroviaria> linhas) {
        this.linhas = linhas;
    }
}
     