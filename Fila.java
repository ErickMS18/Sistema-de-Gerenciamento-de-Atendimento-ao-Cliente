public class Fila {
    private Node inicio;
    private Node fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void insere(Elemento elemento) {
        Node novoNo = new Node(elemento);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public Elemento remove() {
        if (inicio == null) {
            return null;
        }

        Elemento elemento = inicio.getElemento();
        inicio = inicio.getProximo();

        return elemento;
    }

    public void imprime() {
        if (estaVazia()) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Ordem de atendimento:");
        Node atual = inicio;
        while (atual != null) {
            System.out.print(" -> " + atual.getElemento().getDescricao());
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public Boolean estaVazia(){
        return inicio == null;
    }

    public void popularFila(Elemento[] elementos){
        for (Elemento elemento : elementos){
            insere(elemento);
        }
    }
}