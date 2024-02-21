import br.com.java.screenmatch.calculos.CalculadoraDeTempo;
import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;

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

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The White lotus");
        minhaSerie.setAnoDeLancamento(2021);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(2);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodio(60);
        System.out.println("Duração da serie: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Poor Things");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());


    }
}
