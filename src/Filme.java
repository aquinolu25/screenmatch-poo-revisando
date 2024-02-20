public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvalicoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia (double nota) {
        somaAvaliacao += nota;
        totalDeAvalicoes++;
    }

    double pegaMedia() {
        return somaAvaliacao / totalDeAvalicoes;
    }
}
