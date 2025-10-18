public class Elemento {
    String id;
    String descricao;   // nome de cliente ou descrição de solicitação
    String info;    // datahora para solicitações ou motivo do atendimento para clientes

    public Elemento(String id, String descricao, String info) {
        this.id = id;
        this.descricao = descricao;
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
