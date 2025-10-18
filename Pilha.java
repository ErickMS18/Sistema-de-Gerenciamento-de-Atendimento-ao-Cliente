public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public void insere(Elemento elemento) {
        Node novoNo = new Node(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public Elemento remove() {
        if (topo == null) {
            return null;
        }

        Elemento elemento = topo.getElemento();
        topo = topo.getProximo();
        return elemento;
    }

    public void imprime() {
        if (estaVazia()) {
            System.out.println("Histórico vazio");
            return;
        }

        System.out.println("Histórico de solicitações:");
        Node atual = topo;
        while (atual != null) {
            System.out.print(atual.getElemento().getId() + " - " + atual.getElemento().getDescricao() + " - " + atual.getElemento().getInfo());
            System.out.println();
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public Boolean estaVazia(){
        return topo == null;
    }

    public void popularPilha(Elemento[] elementos){
        for (Elemento elemento : elementos){
            insere(elemento);
        }
    }
}