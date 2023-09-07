package java;

public class AparelhoTelefonico {
    private boolean ligado = false;
    private boolean emChamada = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Aparelho telefônico ligado.");
        } else {
            System.out.println("O aparelho telefônico já está ligado.");
        }
    }

    public void atender() {
        if (ligado && !emChamada) {
            emChamada = true;
            System.out.println("Chamada atendida.");
        } else {
            System.out.println("Não é possível atender a chamada no momento.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Correio de voz iniciado.");
        } else {
            System.out.println("Ligue o aparelho telefônico para iniciar o correio de voz.");
        }
    }
}
