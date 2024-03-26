package org.example;

public class Pedido implements Cloneable{
    private String nome;
    private int quantidadePedido;
    private float valor;

    public Pedido(String nome, int quantidadePedido, float valor) {
        super();
        this.nome = nome;
        this.quantidadePedido = quantidadePedido;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(int quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + nome + '\'' +
                "valor='" + valor + '\'' +
                ", quantidade Pedido=" + quantidadePedido +
                '}';
    }
}
