package processualn1_2p.ex5_sistema_de_contas_bancarias.Objeto;
import java.util.Scanner;
public class Conta {
    //Atributos
    private int numero;
    private String titular;
    private double saldo;
    //Construtores
    public Conta(int numero, String titular){
        setNumero(numero);
        setTitular(titular);
        setSaldo(0);
    }
    //Getters
    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    //Setters
    public final void setNumero(int numero){
        if (numero < 0){
            this.numero = 0;
        } else {
            this.numero = numero;
        }
    }

    public final void setTitular(String titular){
        if (titular == null ||titular.isEmpty()){
            this.titular = null;
        } else {
            this.titular = titular;
        }
    }

    public final void setSaldo(double saldo){
        if (saldo < 0 ){
            System.out.println("Valor Invalido, Corrigindo para 0");
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
    //Métodos
    public void calcularSaldo(){
        double saldoAtualizado;
        saldoAtualizado = getSaldo();
        setSaldo(saldoAtualizado);
    }

    Scanner snr = new Scanner(System.in);
    public void depositar(double valor){
        double saldoAtualizado;
        if (valor < 0){
            while (valor < 0){
                System.out.print("Valor Inválido, Insira valor >= 0: ");
                valor = snr.nextDouble();
            }
        } else{
            saldoAtualizado = getSaldo() + valor;
            setSaldo(saldoAtualizado);
        }
    }

    public void sacar(double valor){
        double saldoAtualizado;
        if (valor < 0){
            while (valor < 0){
                System.out.print("Valor Inválido, Insira valor >= 0: ");
                valor = snr.nextDouble();
            }
        } else if (valor > getSaldo()){
            do{
                System.out.printf("O Valor de Saque de R$ %.2f é maior que o Saldo da Conta que é de R$ %.2f.%n",valor, getSaldo());
                System.out.print("Insira um valor válido");
                valor = snr.nextDouble();
                System.out.println();
            }while(valor > getSaldo());
        }else{
            saldoAtualizado = getSaldo() - valor;
            setSaldo(saldoAtualizado);
        }  
    }
}
