package org.example;

public class Venda {
    public double valorPagoCliente;
    public double preco;
    public double comissaoVendedor;

    Venda(double valorPagoCliente, double preco, double comissaoVendedor){
        this.valorPagoCliente = valorPagoCliente;
        this.preco = preco;
        this.comissaoVendedor = comissaoVendedor;
    }
    public double trocoVenda(){
        return this.valorPagoCliente - this.preco;
    }

    public double calcularComissaoVendedor(){
        return this.preco - 100/10;
    }

    public boolean valorPagoEhSuficiente(){
        if(this.valorPagoCliente > this.preco){
            return true;
        }
        return false;
    }

    public  boolean precisaDeTroco(){
        if(this.valorPagoCliente > this.preco){
            return true;
        }
        return false;
    }

    public boolean informaSeFoiPago(){
        return true;
    }
}
