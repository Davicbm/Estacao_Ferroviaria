import java.util.ArrayList;

public class LinhaFerroviaria {
    private int numero;
    private int extensao;
    private String descricao;
    private RecursoFerroviario locomotivas;
    private RecursoFerroviario vagoes;
    private RecursoFerroviario trens;
    private ArrayList<RecursoFerroviario> recursos = new ArrayList<>();

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getExtensao() {
        return extensao;
    }
    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<RecursoFerroviario> getRecursos() {
        return recursos;
    }
    public void setRecursos(ArrayList<RecursoFerroviario> recursos) {
        this.recursos = recursos;
    }

    public RecursoFerroviario getLocomotivas() {
        return locomotivas;
    }
    public void setLocomotivas(RecursoFerroviario locomotivas) {
        this.locomotivas = locomotivas;
    }

    public RecursoFerroviario getVagoes() {
        return vagoes;
    }
    public void setVagoes(RecursoFerroviario vagoes) {
        this.vagoes = vagoes;
    }

    public RecursoFerroviario getTrens() {
        return trens;
    }
    public void setTrens(RecursoFerroviario trens) {
        this.trens = trens;
    }
    
    public LinhaFerroviaria(int numero, int extensao, String descricao) {
        this.numero = numero;
        this.extensao = extensao;
        this.descricao = descricao; 
    }
    public void adicionaRecurso(RecursoFerroviario recursoFerroviario){
        this.recursos.add(recursoFerroviario);
        System.out.println ("Recurso ferroviário adicionado à linha");
    }
    
    public String toString(){
        return "-> Linha: Número = " + numero + ", Extensão = " + extensao  + ", Descrição = " + descricao;
    }
}