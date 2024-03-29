package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.java.screenmatch.modelos.Titulo;
import br.com.java.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=6585022c";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);


                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException ex) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(ex.getMessage());
            } catch (IllegalArgumentException ex) {
                System.out.println("Algum erro na busca, verifique se digitou corretamente!");
            } catch (ErroDeConversaoDeAnoException ex) {
                System.out.println(ex.getMessage());
            }

        }
        System.out.println(titulos);

        FileWriter fileWriter = new FileWriter("filmes.json");
        fileWriter.write(gson.toJson(titulos));
        fileWriter.close();
        System.out.println("O programa finalizou corretamente! ");
    }
}
