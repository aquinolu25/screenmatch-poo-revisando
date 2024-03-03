package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Saltburn", 2023);
        Filme outroFilme = new Filme("Poor Things", 2024);
        var filmeDoLuiz = new Filme("Talk to me", 2022);
        Serie minhaSerie = new Serie("The White lotus", 2021);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDoLuiz);
        lista.add(outroFilme);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Paul Mescal");
        buscaPorArtista.add("Zendaya");
        buscaPorArtista.add("Anne Hathaway");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de filmes ordenada");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
