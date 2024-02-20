public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        
        meuFilme.nome = "Saltburn";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalDeAvalicoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
