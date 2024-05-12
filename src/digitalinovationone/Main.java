package digitalinovationone;

public class Main {
    public static void main(String[] args) {
        Iphone novoIphone = new Iphone();

        novoIphone.adicionarContatos();
        novoIphone.adicionarMusicas();

        novoIphone.ligar("Pedro");
        novoIphone.ligar("MaisLindoDoMundo");
        novoIphone.ligar("Mariah");

        novoIphone.atender("Yudi");
        novoIphone.atender("Batraqueo");
        novoIphone.atender("Tapita");

        novoIphone.iniciarCorreioVoz("Batraqueo");
        novoIphone.selecionarMusica("Snuff - Slipnot");
        novoIphone.selecionarMusica("Outside - Calvin Harris");

        novoIphone.abrirNavegador();
        novoIphone.atualizar("www.google.com");
    }
}