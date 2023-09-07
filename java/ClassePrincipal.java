package java;

import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        // Aqui você pode criar objetos e usar as funcionalidades das classes
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        System.out.print("Digite o nome da música: ");
        String musica = scanner.nextLine();
        reprodutor.selecionarMusica(musica);
        reprodutor.tocar();
        
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        System.out.println("Pressione Enter para ligar o telefone.");
        scanner.nextLine(); // Aguarda a entrada do usuário (Enter)
        telefone.ligar();
        
        System.out.println("Pressione Enter para atender a chamada.");
        scanner.nextLine(); // Aguarda a entrada do usuário (Enter)
        telefone.atender();
        
        NavegadorInternet navegador = new NavegadorInternet();
        System.out.print("Digite a URL a ser exibida: ");
        String url = scanner.nextLine();
        navegador.exibirPagina(url);
        
        scanner.close(); // Fecha o scanner após o uso
    }
}
