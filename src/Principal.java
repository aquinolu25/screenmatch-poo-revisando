import br.com.java.screenmatch.calculos.CalculadoraDeTempo;
import br.com.java.screenmatch.calculos.FiltroRecomendacao;
import br.com.java.screenmatch.modelos.Episodio;
import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Saltburn", 2023);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        System.out.println("Total de avaliações:" + meuFilme.getTotalDeAvalicoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("The White lotus", 2021);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(2);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodio(60);
        System.out.println("Duração da serie: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Poor Things", 2024);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);

        var filmeDoLuiz = new Filme("Talk to me", 2022);
        filmeDoLuiz.setDuracaoEmMinutos(140);
        filmeDoLuiz.avalia(9);
        filmeDoLuiz.avalia(6);
        filmeDoLuiz.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoLuiz);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("*************************************************************");
        System.out.println(listaDeFilmes);


    }
}
