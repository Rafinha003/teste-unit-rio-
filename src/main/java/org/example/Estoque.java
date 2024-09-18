package org.example;

public class Estoque {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidadeEstoque;

    public Estoque(String nome, String codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void adicionarItemEstoque(){
        this.quantidadeEstoque += 1;
    }

    public void removerItemEstoque(){
        this.quantidadeEstoque -= 1;
    }

    public boolean existeProdutoEstoquePeloNome(String nome){
        if(this.nome == nome){
            return true;
        }
        return false;
    }

    public boolean existeProdutoEstoquePeloCodigo(String codigo){
        if(this.codigo == codigo){
            return true;
        }
        return  false;
    }

    public int retorneAQuantidadeDeItemEstoque(){
        return this.quantidadeEstoque;
    }
}
