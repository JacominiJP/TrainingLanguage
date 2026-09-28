package processualn1_2p.ex4_funcionarios_com_heranca.Objetos;

public class Vendedor extends Funcionario {
    //Atributos
    private double comissao;
    private double totalVendas;

    //Construtores
    public Vendedor(String nome, double salarioBase){
        super(nome, salarioBase);
        setComissao(0.1);
        setTotalVendas(0);
    }
    //Getters
    public double getComissao(){
        return comissao;
    }
    public double getTotalVendas(){
        return totalVendas;
    }
    //Setters
    public void setComissao(double comissao){
        if (comissao < 0){
            this.comissao = 0.1;
        } else {
            this.comissao = comissao;
        }
    }

    public void setTotalVendas(double totalVendas){
        if (totalVendas < 0){
            this.totalVendas = 0;
            System.out.println("Não é possível o total de vendas ser negativo, valor resetado para 0");
        } else {
            this.totalVendas = totalVendas;
        }
    }
    //Métodos
    @Override
    public double calcularSalario(double comissao){
        double salario;
        salario = getSalarioBase() +getTotalVendas() * comissao;
        return salario;
    } 

}
