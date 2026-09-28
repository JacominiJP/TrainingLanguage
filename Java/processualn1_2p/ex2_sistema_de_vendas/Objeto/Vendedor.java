package processualn1_2p.ex2_sistema_de_vendas.Objeto;

import java.util.Scanner;

public class Vendedor {
    //Atributos
    private double Comissao;
    private double totalVendas;
    private double maiorVenda;
    private double menorVenda;
    private double mediaVendas;
    private int qtdVendas500;
    //Construtores
    public Vendedor(){
        setComissao(0.03);
        setTotalVendas(0);
        this.menorVenda = Double.MAX_VALUE;
        this.maiorVenda = Double.MIN_VALUE;
        setMediaVendas(0, 0);
        setQtdVendas500(0);
    }

    //Getters
    public double getComissao(){
        return Comissao;
    }
    public double getTotalVendas(){
        return totalVendas;
    }
    public double getMaiorVenda(){
        return maiorVenda;
    }
    public double getMenorVenda(){
        return menorVenda;
    }
    public double getMediaVendas(){
        return mediaVendas;
    }
    public double getQtdVendas500(){
        return qtdVendas500;
    }
    //Setters
    private void setComissao(double totalVendas){
        if (totalVendas <= 1000){
            this.Comissao = getTotalVendas()*0.03;
        } else if (totalVendas > 1000 && totalVendas < 5000){
            this.Comissao = getTotalVendas()*0.05;
        } else {
            this.Comissao = getTotalVendas()*0.08;
        }
    }
    private void setTotalVendas(double totalVendas){
        if (totalVendas < 0){
            this.totalVendas = 0;
        } else {
            this.totalVendas = totalVendas;
        }
    }
    private void setMaiorMenorVenda(double venda){
        if (venda > this.maiorVenda){
            this.maiorVenda = venda;
        } else if (venda< this.menorVenda){
            this.menorVenda = venda;
        }
    }
    private void setMediaVendas(int qtdVendas, double ganhosTotais){
        double media;
        media = ganhosTotais / qtdVendas;
        this.mediaVendas = media;
    }
    private void setQtdVendas500(int qtdVendas500){
        if (qtdVendas500 < 0) {
            System.out.println("Nn pode ser aplicado");
            this.qtdVendas500 += 0;
        } else {
            this.qtdVendas500 += qtdVendas500;
        }
    }
    //Métodos
    Scanner snr = new Scanner(System.in);
    public void calcularVendas(Vendas vendas){
        int i;
        double venda, ganhosTotais = 0;
        for (i = 0; i < vendas.getQtdVendas(); i++){
            System.out.print("Valor da "+ (i+1) +"º Venda: ");
            venda = snr.nextDouble();
            vendas.setValorVenda(venda);
            ganhosTotais += vendas.getValorVendas();
            setMaiorMenorVenda(venda);
            if (venda > 500) {
                setQtdVendas500(1);
            }
        }
        setTotalVendas(ganhosTotais);
        setMediaVendas(vendas.getQtdVendas(), ganhosTotais);
    }

    public void calcularComissao(double ganhoComissao){
        setComissao(getTotalVendas());
    }

    public void showInfoVendas(){
        System.out.println("INFORMAÇÕES DAS VENDAS FEITAS");
        System.out.printf("VALOR TOTAL VENDIDO: R$ %.2f %n", getTotalVendas());
        System.out.printf("SUA MAIOR VENDA FOI DE R$ %.2f %n", getMaiorVenda());
        System.out.printf("SUA MENOR VENDA FOI DE R$ %.2f %n", getMenorVenda());
        System.out.printf("SUA MÉDIA DE VENDAS FOI DE R$ %.2f %n", getMediaVendas());
        System.out.println("QUANTIDADE DE VENDAS ACIMA DE R$ 500,00: " +getQtdVendas500());
        System.out.printf("COMISSÃO DO VENDEDOR FOI DE R$ %.2f %n", getComissao());
    }
}