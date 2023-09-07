package java;

public class ReprodutorMusical {
    private boolean estaTocando = false;
    private String musicaAtual;

    public void tocar() {
        if (!estaTocando) {
            estaTocando = true;
            System.out.println("Reproduzindo música: " + musicaAtual);
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    public void pausar() {
        if (estaTocando) {
            estaTocando = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Não há música tocando para pausar.");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
