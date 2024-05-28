public class Compra implements Comparable<Compra> {
    private String produto;
    private double preco;


    public Compra(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;

    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return "Compra: produto= " + produto + '\'' +
               " preco= " + preco;
    }



    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
    }
}


