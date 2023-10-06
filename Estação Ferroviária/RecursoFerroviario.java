public class RecursoFerroviario {
    private Trem trens;
    private Vagao vagoes;
    private Locomotiva locomotivas;

    public RecursoFerroviario(Vagao vagoes) {
        this.vagoes = vagoes;
    }

    public RecursoFerroviario(Trem trens) {
        this.trens = trens;
    }

    public RecursoFerroviario (Locomotiva locomotivas) {
        this.locomotivas  = locomotivas;
    }

    public Trem getTrens() {
        return trens;
    }
    public void setTrens(Trem trens) {
        this.trens = trens;
    }

    public Vagao getVagoes() {
        return vagoes;
    }
    public void setVagoes(Vagao vagoes) {
        this.vagoes = vagoes;
    }

    public Locomotiva getLocomotivas() {
        return locomotivas;
    }
    public void setLocomotivas(Locomotiva locomotivas) {
        this.locomotivas = locomotivas;
    }
}
