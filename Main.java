import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha historico = new Pilha();
        Fila atendimento = new Fila();

        Elemento[] listaAtendimento = new Elemento[] {
                new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        Elemento[] listaHistorico = new Elemento[] {
                new Elemento("REQ001", "Instalação de software", "2025-10-18 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2025-10-18 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2025-10-18 11:30"),
                new Elemento("REQ004", "Suporte técnico", "2025-10-18 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2025-10-18 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2025-10-18 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2025-10-18 13:30"),
                new Elemento("REQ008", "Configuração de rede", "2025-10-18 14:00"),
                new Elemento("REQ009", "Restauração de dados", "2025-10-18 14:30"),
                new Elemento("REQ010", "Consulta técnica", "2025-10-18 15:00")
        };

        atendimento.popularFila(listaAtendimento);
        historico.popularPilha(listaHistorico);

        int opcao;

        do {
            System.out.println("\n1. Adicionar cliente à fila");
            System.out.println("2. Atender próximo cliente");
            System.out.println("3. Adicionar solicitação ao histórico");
            System.out.println("4. Remover última solicitação");
            System.out.println("5. Exibir fila de atendimento");
            System.out.println("6. Exibir histórico de solicitações");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Motivo: ");
                    String motivo = sc.nextLine();
                    atendimento.insere(new Elemento(id, nome, motivo));
                    break;

                case 2:
                    Elemento cliente = atendimento.remove();
                    if (cliente == null)
                        System.out.println("Fila vazia.");
                    else
                        System.out.println("Atendendo: " + cliente.descricao);
                    break;

                case 3:
                    System.out.print("ID da solicitação: ");
                    String reqId = sc.nextLine();
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Data e hora: ");
                    String dataHora = sc.nextLine();
                    historico.insere(new Elemento(reqId, desc, dataHora));
                    break;

                case 4:
                    Elemento removido = historico.remove();
                    if (removido == null)
                        System.out.println("Histórico vazio.");
                    else
                        System.out.println("Removido: " + removido.descricao);
                    break;

                case 5:
                    atendimento.imprime();
                    break;

                case 6:
                    historico.imprime();
                    break;
            }
        } while (opcao != 0);
    }
}
