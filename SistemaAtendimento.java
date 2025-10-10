import java.util.Scanner;

public class SistemaAtendimento {

    // ===================== CLASSE ELEMENTO =====================
    static class Elemento {
        String id;
        String descricao;
        String dataHora;

        public Elemento(String id, String descricao, String dataHora) {
            this.id = id;
            this.descricao = descricao;
            this.dataHora = dataHora;
        }

        public Elemento(String id, String descricao) {
            this.id = id;
            this.descricao = descricao;
            this.dataHora = null;
        }

        public void imprimir() {
            System.out.print("[" + id + "] " + descricao);
            if (dataHora != null)
                System.out.print(" (" + dataHora + ")");
            System.out.println();
        }
    }

    // ===================== CLASSE NODE =====================
    static class Node {
        Elemento info;
        Node proximo;

        public Node(Elemento info) {
            this.info = info;
            this.proximo = null;
        }
    }

    // ===================== CLASSE PILHA =====================
    static class Pilha {
        private Node topo;

        public Pilha() {
            topo = null;
        }

        public boolean vazia() {
            return topo == null;
        }

        public void empilhar(Elemento elemento) {
            Node novo = new Node(elemento);
            novo.proximo = topo;
            topo = novo;
            System.out.println("Adicionado ao histórico: " + elemento.id);
        }

        public Elemento desempilhar() {
            if (vazia()) {
                System.out.println("Histórico vazio!");
                return null;
            }
            Elemento removido = topo.info;
            topo = topo.proximo;
            return removido;
        }

        public void imprimir() {
            if (vazia()) {
                System.out.println("Histórico vazio.");
                return;
            }
            System.out.println("=== Histórico de Solicitações ===");
            Node atual = topo;
            while (atual != null) {
                atual.info.imprimir();
                atual = atual.proximo;
            }
            System.out.println("===============================");
        }
    }

    // ===================== CLASSE FILA =====================
    static class Fila {
        private Node frente;
        private Node tras;

        public Fila() {
            frente = null;
            tras = null;
        }

        public boolean vazia() {
            return frente == null;
        }

        public void enfileirar(Elemento elemento) {
            Node novo = new Node(elemento);
            if (vazia()) {
                frente = novo;
                tras = novo;
            } else {
                tras.proximo = novo;
                tras = novo;
            }
            System.out.println("Cliente adicionado à fila: " + elemento.id);
        }

        public Elemento desenfileirar() {
            if (vazia()) {
                System.out.println("Fila vazia!");
                return null;
            }
            Elemento removido = frente.info;
            frente = frente.proximo;
            if (frente == null) {
                tras = null;
            }
            return removido;
        }

        public void imprimir() {
            if (vazia()) {
                System.out.println("Fila vazia.");
                return;
            }
            System.out.println("=== Fila de Atendimento ===");
            Node atual = frente;
            while (atual != null) {
                atual.info.imprimir();
                atual = atual.proximo;
            }
            System.out.println("===========================");
        }
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Fila fila = new Fila();
        Pilha historico = new Pilha();

        // ---- Carrega elementos simulando os arquivos ----
        Elemento[] filaAtendimento = new Elemento[] {
            new Elemento("CLI001", "Maria Silva - Dúvida sobre produto"),
            new Elemento("CLI002", "João Souza - Reclamação de serviço"),
            new Elemento("CLI003", "Ana Costa - Solicitação de reembolso"),
            new Elemento("CLI004", "Pedro Alves - Informações de entrega"),
            new Elemento("CLI005", "Carla Dias - Agendamento de visita")
        };

        Elemento[] historicoDados = new Elemento[] {
            new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
            new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
            new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30")
        };

        // ---- Adiciona os dados iniciais ----
        for (int i = 0; i < 5; i++) {
            fila.enfileirar(filaAtendimento[i]);
        }
        for (int i = 0; i < 3; i++) {
            historico.empilhar(historicoDados[i]);
        }

        // ---- Menu ----
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== MENU DE ATENDIMENTO =====");
            System.out.println("1 - Mostrar fila de atendimento");
            System.out.println("2 - Atender próximo cliente");
            System.out.println("3 - Mostrar histórico de solicitações");
            System.out.println("4 - Adicionar nova solicitação ao histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                opcao = -1;
            }

            if (opcao == 1) {
                fila.imprimir();
            } else if (opcao == 2) {
                Elemento atendido = fila.desenfileirar();
                if (atendido != null) {
                    System.out.println("Atendendo cliente: ");
                    atendido.imprimir();
                }
            } else if (opcao == 3) {
                historico.imprimir();
            } else if (opcao == 4) {
                System.out.print("ID da solicitação: ");
                String id = input.nextLine();
                System.out.print("Descrição: ");
                String desc = input.nextLine();
                System.out.print("Data e hora (YYYY-MM-DD HH:MM): ");
                String dh = input.nextLine();
                historico.empilhar(new Elemento(id, desc, dh));
            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        input.close();
    }
}
