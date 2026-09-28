package processualn1_2p.ex5_sistema_de_contas_bancarias.Objeto;

public class ContaPoupanca extends Conta {
    //Atributos
    private double rentabilidade;
    //Construtores
    public ContaPoupanca(int numero, String titular){
        super(numero, titular);
        setRentabilidade(0.05);
    }
    //Getters
    public double getRentabilidade(){
        return rentabilidade;
    }
    //Setters
    public void setRentabilidade(double rentabilidade){
        if (rentabilidade != 0.05){
            this.rentabilidade = 0.05;
        } else{
            this.rentabilidade = rentabilidade;
        }
    }
    //Métodos
    @Override
    public void calcularSaldo(){
        double saldoAtualizado;
        saldoAtualizado = getSaldo() * (getRentabilidade() +1);
        setSaldo(saldoAtualizado);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor){
        super.sacar(valor);
    }
}
