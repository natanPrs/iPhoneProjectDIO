package digitalinovationone;

import digitalinovationone.interfaces.Navegador;
import digitalinovationone.interfaces.ReprodutorMusical;
import digitalinovationone.interfaces.Telefone;

import java.util.*;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {

    private Map<String, Integer> contatos;
    private List<String> musicas;

    public Iphone(){
        contatos = new HashMap<>();
        musicas = new ArrayList<>();
    }

    public void adicionarContatos() {
        contatos.put("Pedro", 1243);
        contatos.put("Mariah", 2345678);
        contatos.put("MaisLindoDoMundo", 6666);
        contatos.put("Batraqueo", 4321);
        contatos.put("Yudi", 40028922);

    }

    public void adicionarMusicas(){
        musicas.add("Snuff - Slipnot");
        musicas.add("It's Time - imagine dragons");
        musicas.add("Outside - Calvin Harris");
        musicas.add("Michelle - Beatles");
        musicas.add("2345MEIA78 - Gabriel o pensador");
    }

    @Override
    public void ligar(String contato) {
        if (contatos.containsKey(contato)){
            Integer numero = contatos.get(contato);
            System.out.println("Ligando para " + contato + ": " + numero);
        } else System.out.println("Contato não encontrado!");

    }
    @Override
    public void atender(String contato) {
        if (contatos.containsKey(contato)){
            System.out.println("Atendendo ligação de " + contato);
        } else System.out.println("Ligação recusada, número desconhecido.");
    }

    @Override
    public void iniciarCorreioVoz(String contato) {
        if (contatos.containsKey(contato)){
            System.out.println("Iniciando correio de voz para " + contato);
        } else System.out.println("Contato não encontrado!");
    }
    @Override
    public void selecionarMusica(String musica) {
        if(musicas.contains(musica)){
            System.out.println("Musica Selecionada, Voce deseja toca-la? (sim ou não) ");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();
            if (Objects.equals(entrada, "sim")){
                tocar(musica);
            } else pausar(musica);
        } else System.out.println("Musica não encontrada!");

    }
    @Override
    public void tocar(String musica) {
        if (musicas.contains(musica)){
            System.out.println("Tocando musica " + musica);
        }else {
            System.out.println("Musica não encontrada!");
        }
    }

    @Override
    public void pausar(String musica) {
        if (musicas.contains(musica)){
            System.out.println(musica + " Pausada");
        }else {
            System.out.println("Musica não encontrada!");
        }

    }

    public void abrirNavegador(){
        System.out.println("Abrindo o navegador...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o site:");
        String entrada = scanner.nextLine();
        exibirPagina(entrada);
    }
    @Override
    public void exibirPagina(String site) {
        System.out.println("Abrindo o site: " + site);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba em branco");

    }

    @Override
    public void atualizar(String site) {
        System.out.println("Atualizando a pagina " + site);

    }
}