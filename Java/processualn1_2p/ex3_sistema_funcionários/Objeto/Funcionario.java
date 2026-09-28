package processualn1_2p.ex3_sistema_funcionários.Objeto;
import java.util.Scanner;
public class Funcionario {
    //Atributos
    private String nome;
    private String cargo;
    private double salario;
    //Construtores
    public Funcionario(String nome, String cargo, double salario){
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }
    //Getters
    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }
    //Setters
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()) {
            System.out.println("Isso nn é um nome");
            this.nome = null;
        } else{
            this.nome = nome;
        }
    }

    public void setCargo(String cargo){
        if (cargo == null || cargo.isEmpty()) {
            System.out.println("Isso nn é um cargo");
            this.cargo = null;
        } else{
            this.cargo = cargo;
        }
    }

    public void setSalario(double salario){
        if (salario < 0){
            System.out.println("Proletários de todos os países, uni-vos. -Karl Marx");
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }
    //Métodos
    Scanner snr = new Scanner(System.in);
    public void aumentarSalario(double porcentagem){
        double novoSalario;
        while (porcentagem < 0){
            System.out.print("Porcentagem deve ser >= 0: ");
            porcentagem = snr.nextDouble();
        }
        novoSalario = getSalario() * ((porcentagem/100) + 1) ;
        setSalario(novoSalario);
    }

    private  double calcularSalarioAnual(){
        return getSalario() * 12;
    }

    public void exibirDados(){
        System.out.println("DADOS DO FUNCIONÁRIO "+getNome()+": ");
        System.out.println("Cargo Atual: "+getCargo());
        System.out.printf("Salário Mensal em R$: %.2f%n",getSalario());
        double salarioAnual = calcularSalarioAnual();
        System.out.printf("Salário Anual em R$: %.2f%n",salarioAnual);
    }
}
