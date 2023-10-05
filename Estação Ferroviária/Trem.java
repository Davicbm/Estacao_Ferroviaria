import java.util.ArrayList;

public class Trem {

    private String prefixo;
    private String dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;
    private ArrayList<RecursoFerroviario> recursos = new ArrayList<>();
    private int numElementos;

    public String getPrefixo() {
        return prefixo;
    }
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }
    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public EstacaoFerroviaria getEstacaoOrigem() {
        return estacaoOrigem;
    }
    public void setEstacaoOrigem(EstacaoFerroviaria estacaoOrigemorigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public EstacaoFerroviaria getEstacaoDestino() {
        return estacaoDestino;
    }
    public void setEstacaoDestino(EstacaoFerroviaria estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }
    public int getNumElementos() {
        return numElementos;
    }
    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public Trem (String prefixo, String dataFormacao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino) {
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }

    public void adicionarRecursos (RecursoFerroviario recurso){
        if (numElementos < 150){
            recursos.add(recurso);
            numElementos++;
            System.out.println("Recurso adicionado");        
        }
        else{
            System.out.println("Número máximo de recursos por trem atingido");
        }
    }

    public String toString() {
        return "- Trem: Prefixo = " + prefixo + ", Data de Formacao = " + dataFormacao + ", Número de Elementos = " + numElementos;
    }
}