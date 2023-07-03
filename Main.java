package Ex1;

import java.util.Scanner;

public class Main {
    public static void exibirMenu() {
        System.out.println("Digite uma opção");
        System.out.println("Digite 1 para adicionar alimento na lista");
        System.out.println("Digite 2 para exibir lista");
        System.out.println("Digite 3 para sair");
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaAlimento listaAlimento = new ListaAlimento();

        int opcao ;

        while (true){
            exibirMenu();
             opcao = entrada.nextInt();
            switch (opcao) {
                case 1: // adicionar lista

                    System.out.println("Digite o tipo de alimento");
                    String tipoAlimento = entrada.next();
                    validarTipoAlimento(tipoAlimento);

                    System.out.print("Digite a quantidade: ");
                    String quantidade = entrada.next();

                    System.out.print("Digite o nome do alimento: ");
                    String nome = entrada.next();

                    try {
                        listaAlimento.addAlimentosNaLista(tipoAlimento,quantidade,nome);
                    } catch (IllegalArgumentException | UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2: // exibir lista
                    listaAlimento.exibirListaDeAlimento();


                    break;

                case 3: // sair
                    System.exit(0);

                    break;

                default:
                    System.out.println("opção incorreta");
            }

        }

    }
    private static void validarTipoAlimento(String tipoAlimento) {
        if (!tipoAlimento.equalsIgnoreCase("VERDURA") && !tipoAlimento.equalsIgnoreCase("LEGUME") && !tipoAlimento.equalsIgnoreCase("GRÃOS") && !tipoAlimento.equalsIgnoreCase("OUTROS")) {
            throw new IllegalArgumentException("Tipo de alimento inválido");
        }
    }
}
