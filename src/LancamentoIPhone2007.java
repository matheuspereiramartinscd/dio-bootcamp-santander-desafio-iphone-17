import java.util.Scanner;

public class LancamentoIPhone2007 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    Scanner scanner = new Scanner(System.in);
    String pagina = "www.exemplo.com.br";

    public static void main(String[] args) {
        LancamentoIPhone2007 iphone = new LancamentoIPhone2007();
        iphone.ligar();
        iphone.menuPrincipal();
    }

    public void menuPrincipal() {
        int opcao;
        do {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Navegador de Internet");
            System.out.println("2. Aparelho Telefonico");
            System.out.println("3. Reprodutor Musical");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuNavegadorInternet();
                    break;
                case 2:
                    menuAparelhoTelefonico();
                    break;
                case 3:
                    menuReprodutorMusical();
                    break;
                case 0:
                    System.out.println("Desligando aparelho...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void menuNavegadorInternet() {
        int opcao;
        do {
            System.out.println("\nNavegador de Internet:");
            System.out.println("1. Exibir Pagina");
            System.out.println("2. Adicionar Nova Aba");
            System.out.println("3. Atualizar Pagina");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    exibirPagina(pagina);
                    break;
                case 2:
                    adicionarNovaAba(pagina);
                    break;
                case 3:
                    atualizarPagina();
                    break;
                case 0:
                    System.out.println("\nVoltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void menuAparelhoTelefonico() {
        int opcao;
        do {
            System.out.println("\nAparelho Telefonico:");
            System.out.println("1. Atender Ligacao");
            System.out.println("2. Iniciar Correio de Voz");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    atender();
                    break;
                case 2:
                    iniciarCorreioVoz();
                    break;
                case 0:
                    System.out.println("\nVoltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void menuReprodutorMusical() {
        int opcao;
        do {
            System.out.println("\nReprodutor Musical:");
            System.out.println("1. Tocar Musica");
            System.out.println("2. Pausar Musica");
            System.out.println("3. Selecionar Musica");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    tocar();
                    break;
                case 2:
                    pausar();
                    break;
                case 3:
                    selecionarMusica("Musica 01");
                    break;
                case 0:
                    System.out.println("\nVoltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    @Override
    public void tocar() {
        System.out.println("\nTocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("\nMusica pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.print(
                "\nPor favor, escolha musica: \n1. Musica 01 \n2. Musica 02 \n3. Musica 03 \n4. Musica 04 \n\nDigite a opcao:");
        int opcao2 = scanner.nextInt();
        switch (opcao2) {
            case 1:
                System.out.println("\nMusica 01 escolhida");

                break;
            case 2:
                System.out.println("\nMusica 02 escolhida");
                break;
            case 3:
                System.out.println("\nMusica 03 escolhida");
                break;
            case 4:
                System.out.println("\nMusica 04 escolhida");
                return;

            default:
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                System.out.println(">>> Opcao inválida. Tente novamente.");
        }
    }

    @Override
    public void ligar() {
        System.out.println("\nLigando aparelho...");
    }

    @Override
    public void atender() {
        System.out.println("\nAtendendo ligacao...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\nIniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("\nExibindo pagina... " + pagina);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.print("\nDigite uma pagina a ser adicionada... ");
        scanner.nextLine();
        pagina = scanner.nextLine();
        System.out.println("\nPagina " + pagina + " adicionada com sucesso... ");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("\nAtualizando pagina...");
    }
}

interface AparelhoTelefonico {
    void ligar();

    void atender();

    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba(String url);

    void atualizarPagina();
}

interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}