import java.util.Scanner;

public class seletiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Validação de Processo Seletivo");

        boolean candidatoQualificado = false;

        while (!candidatoQualificado) {
            System.out.println("Por favor, insira suas informações:");

            // Solicita ao usuário que insira o nome
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Solicita ao usuário que insira a idade
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente após a entrada de idade

            // Solicita ao usuário que insira a experiência
            System.out.print("Anos de experiência: ");
            int anosExperiencia = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente após a entrada de experiência

            // Verificar se o candidato atende aos critérios de seleção
            if (idade >= 18 && anosExperiencia >= 2) {
                System.out.println("Parabéns, " + nome + "! Você está qualificado para o processo seletivo.");
                candidatoQualificado = true;
            } else {
                System.out.println("Desculpe, " + nome + ". Você não atende aos critérios mínimos para o processo seletivo.");
                System.out.println("Por favor, insira as informações novamente.");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
