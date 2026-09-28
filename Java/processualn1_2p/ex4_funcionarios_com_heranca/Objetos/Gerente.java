package processualn1_2p.ex4_funcionarios_com_heranca.Objetos;

public class Gerente extends Funcionario{
    //Atributos
    private double bonus;
    //Construtores
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
        setBonus(0.2);
    }
    //Getters
    public double getBonus(){
        return bonus;
    }
    //Setters
    public void setBonus(double bonus){
        if (bonus != 0.2){
            this.bonus = 0.2;
        } else {
            this.bonus = bonus;
        }
    }
    //Métodos
    @Override
    public double calcularSalario(double bonus){
        double salario;
        salario = getSalarioBase() * (1 + bonus);
        return salario;
    }
    
}
