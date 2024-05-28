import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);


        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite o nome do produto: ");
            String produto = leitura.next();

            System.out.println("Digite o valor da compra");
            double preco = leitura.nextDouble();


            Compra compra = new Compra(produto, preco);
            boolean compraRealizada = cartao.lancaCompra(compra);


            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair  = leitura.nextInt();
            } else {
                System.out.println("Compra não realizada! Verifique o saldo do cartao de crédito");
                sair = 0;
            }
        }

        System.out.println("***************************");
        System.out.println("COMPRAS REALIZADAS\n");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()){
            System.out.println(c.getProduto() + "-" + c.getPreco());
        }
        System.out.println("\nSaldo do Cartão: " + cartao.getSaldo());
    }
}


