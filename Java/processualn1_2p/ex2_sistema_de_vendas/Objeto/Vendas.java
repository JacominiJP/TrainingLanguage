package processualn1_2p.ex2_sistema_de_vendas.Objeto;
import java.util.Scanner;
public class Vendas {
    //Atributos
    private int qtdVendas;
    private double valorVenda;
    //Construtores
    public Vendas(){
        setQtdVendas(0);
        setValorVenda(0);
    }
    //Getters
    public int getQtdVendas(){
        return qtdVendas;
    }

    public double getValorVendas(){
        return valorVenda;
    }
    //Setters
    Scanner snr = new Scanner(System.in);
    public void setQtdVendas(int qtdVendas){
        if (qtdVendas < 0) {
            System.out.println("Quantidade Inválida, coloque um Quantidade q seja um número inteiro e >= 0!");
            do{
                System.out.print("Quantidade do Produto Vendido: ");
                this.qtdVendas = snr.nextInt();
            }while(this.qtdVendas < 0);
        } else {
            this.qtdVendas = qtdVendas;
        }
    }

    public void setValorVenda(double valorVenda){
        if (valorVenda <0){
            System.out.println("Valor Inválido, coloque um valor q seja um número >= 0!");
            do{
                System.out.print("Valor do Produto: ");
                this.valorVenda = snr.nextDouble();
            }while(this.valorVenda < 0);
        } else {
            this.valorVenda = valorVenda;
        
        }
    }
    
    //Métodos
    
}
