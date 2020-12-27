package model;


import java.util.Date;

public class OrdemPedidos {

    private Clientes cliente;
    private Date data;
    private int idPedidos;
    private int quantidade;
    private String tipo;
    private float valor;
    private Date dataEntrega;
    private String situacao;
    private float tricoline = 6.00f;
    private float tecnologico = 8.00f;
    private float cambraia=10.00f;

    public OrdemPedidos(Clientes cliente) {
        //setData(this.data);
        this.setValor(0.00f);
        this.cliente=cliente;

    }

    public void valorPedido(int qtde, String tipo){
        setQuantidade(qtde);
        setTipo(tipo);
        setDataEntrega(this.data);


        if(getTipo() == "tricoline"){
            setValor(this.tricoline * getQuantidade());

        }else if(getTipo() == "cambraia"){
            setValor(this.cambraia * getQuantidade());


        }else if(getTipo() =="tecnologico"){
            setValor(this.tecnologico * getQuantidade());

        }

    }

    public void statusPedido(){
        System.out.println("---------Pedido de máscaras de proteção--------------");

        System.out.println("Pedido do cliente: "+getCliente().getName());
        //System.out.println("A data do pedido é: "+ getData());
        //System.out.println("A data da entrega é: "+getDataEntrega()+2);
        System.out.println("o valor total do pedido é: R$"+this.getValor());
        System.out.println("A quantidade de mascaras é: "+getQuantidade());
        System.out.println("O tipo das mascaras é: "+getTipo());

        System.out.println(" ");

    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
