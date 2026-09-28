package processualn1_2p.ex4_funcionarios_com_heranca.Objetos;

public class Funcionario {
    //Atributos
    private String nome;
    private double salarioBase;
    //Construtores
    public Funcionario(String  nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }
    //Getters
    public String  getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
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

    public final void setSalarioBase(double salarioBase){
        if (salarioBase < 0){
            System.out.println("Isso não pode ser considerado salário!");
            this.salarioBase = 0;
        } else{
            this.salarioBase = salarioBase;
        }
    }
    //Métodos
    public double calcularSalario(double bonificacao){
        double salario;
        salario = getSalarioBase() * (1 + bonificacao);
        return salario;
    }
}
