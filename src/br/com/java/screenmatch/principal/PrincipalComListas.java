package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Saltburn", 2023);
        Filme outroFilme = new Filme("Poor Things", 2024);
        var filmeDoLuiz = new Filme("Talk to me", 2022);
        Serie minhaSerie = new Serie("The White lotus", 2021);

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
