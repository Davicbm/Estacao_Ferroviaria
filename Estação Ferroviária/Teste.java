public class Teste {
    public static void main (String [] args) { 
        Locomotiva locomotiva = new Locomotiva("L7", 300, 20);
        Vagao vagao = new Vagao("V6", "carga", 300, 23, 9);
        Locomotiva locomotiva2 = new Locomotiva("Loc234", 700, 90);
        Vagao vagao2 = new Vagao("VA890", "passageiro", 20, 300, 7);
        Vagao vagao3 = new Vagao("V760", "passageiro", 87, 130, 2);

        EstacaoFerroviaria destino = new EstacaoFerroviaria("ABCD", "Destino");
        LinhaFerroviaria linha1 =  new LinhaFerroviaria(32,100, "linha parangaba");
        destino.adicionarLinhas(linha1);
        linha1.adicionaRecurso(new RecursoFerroviario(locomotiva2));
        linha1.adicionaRecurso(new RecursoFerroviario(vagao3));
        
        EstacaoFerroviaria origem = new EstacaoFerroviaria("EFGH", "Origem");
        LinhaFerroviaria linha2 = new LinhaFerroviaria(45, 347, "linha messejana");
        origem.adicionarLinhas(linha2);
        linha2.adicionaRecurso(new RecursoFerroviario(vagao2));

        Trem trem = new Trem("true-","03/05/1990", destino, origem);

        trem.adicionarRecursos(new RecursoFerroviario(vagao));
        trem.adicionarRecursos(new RecursoFerroviario(locomotiva));

        System.out.print(destino.toString());
        System.out.println(linha1.toString());
        System.out.println(locomotiva2.toString());
        System.out.println(vagao3.toString());
        System.out.println("");
        
        System.out.print(origem.toString());
        System.out.println(linha2.toString());
        System.out.println(vagao2.toString());
        System.out.println(trem.toString());
        System.out.println(vagao.toString2());
        System.out.println(locomotiva.toString2());
    }
}