public class Node {

    private Elemento elemento;
    private Node proximo;

    Node(Elemento elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    Elemento getElemento(){
        return this.elemento;
    }

    Node getProximo(){
        return this.proximo;
    }

    void setElemento(Elemento elemento){
        this.elemento = elemento;
    }
    void setProximo(Node proximo){
        this.proximo = proximo;
    }




}