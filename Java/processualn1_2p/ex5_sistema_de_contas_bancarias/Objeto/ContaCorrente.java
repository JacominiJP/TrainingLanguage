package processualn1_2p.ex5_sistema_de_contas_bancarias.Objeto;
public class ContaCorrente extends Conta {
    //Atributos
    private double taxa;
    //Construtores
    public ContaCorrente(int numero, String titular){
        super(numero, titular);
        setTaxa(2.5);
    }
    //Getters
    public double getTaxa(){
        return taxa;
    }
    //Setters
    public void setTaxa(double taxa){
        if (taxa != 2.5){
            this.taxa = 2.5;
        } else{
            this.taxa = taxa;
        }
    }
    //Métodos
    @Override
    public void calcularSaldo(){
        double saldoAtualizado;
        saldoAtualizado = getSaldo() - getTaxa();
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
