package processualn1_2p.ex2_sistema_de_vendas;
import processualn1_2p.ex2_sistema_de_vendas.Objeto.Vendedor;
import processualn1_2p.ex2_sistema_de_vendas.Objeto.Vendas;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int qtdVendas;
        Scanner snr = new Scanner(System.in);
        Vendas vendas = new Vendas();
        Vendedor vendedor = new Vendedor();
        System.out.print("Quantas Vendas Foram Feitas: ");
        qtdVendas = snr.nextInt();
        vendas.setQtdVendas(qtdVendas);
        vendedor.calcularVendas(vendas);
        vendedor.calcularComissao(vendedor.getTotalVendas());
        vendedor.showInfoVendas();
        snr.close();
    }
}