import br.com.java.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        
        meuFilme.setNome("Saltburn");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        System.out.println("Total de avaliações:" + meuFilme.getTotalDeAvalicoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
