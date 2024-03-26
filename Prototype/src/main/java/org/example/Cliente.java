package org.example;

public class Cliente implements Cloneable {
    private int id;
    private String nome;
    private Endereco endereco;
    private Pedido pedido;

    public Cliente(int id, String nome, Endereco endereco, Pedido pedido) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }



    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.endereco = (Endereco) clienteClone.endereco.clone();
        clienteClone.pedido = (Pedido) clienteClone.pedido.clone();
        return clienteClone;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", pedido='" + pedido+ '\'' +
                '}';
    }
}
