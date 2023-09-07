package java;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abasAbertas = new ArrayList<>();

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        abasAbertas.add(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        if (!abasAbertas.isEmpty()) {
            String paginaAtual = abasAbertas.get(abasAbertas.size() - 1);
            System.out.println("Página atualizada: " + paginaAtual);
        } else {
            System.out.println("Não há abas abertas para atualizar.");
        }
    }
}
