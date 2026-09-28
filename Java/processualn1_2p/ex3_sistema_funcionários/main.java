package processualn1_2p.ex3_sistema_funcionários;
import processualn1_2p.ex3_sistema_funcionários.Objeto.Funcionario;
import java.util.Scanner;
public class main {
    public static int showMenu(){
        Scanner snr = new Scanner(System.in);
        int escolha;
        do{
            System.out.println("### MENU DOS FUNCIONÁRIOS ####");
            System.out.println("1. Aumentar Salário");
            System.out.println("2. Exibir Dados do Funionario");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            escolha = snr.nextInt();
            System.err.println();
        }while(escolha < 0);
        return escolha;
    }
    public static void main(String[] args){
        Scanner snr = new Scanner(System.in);
        int escolha, i, numFun;
        double porcentagem, salarioAntigo;
        Funcionario[] f = new Funcionario[5];
        f[0] = new Funcionario("Adailton", "Zelador", 2200);
        f[1] = new Funcionario("Joseildis", "Secretária", 2800);
        f[2] = new Funcionario("Raimundo", "Gerente", 4000);
        f[3] = new Funcionario("Jailton","Segurança", 2300);
        f[4] = new Funcionario("Alemão", "Balconista", 1800);
        escolha = showMenu();
        do {
            switch(escolha){
                case 1:
                    System.out.println("Escolha o Funcionario pelo número: ");
                    for (i = 0; i < 5; i++) {
                        System.out.println(i+". "+f[i].getNome());
                    }
                    System.out.print("Escolha: ");
                    numFun = snr.nextInt();
                    System.err.println();
                    System.out.print("Quantos % vc deseja aumentar o salário de "+f[numFun].getNome()+": ");
                    porcentagem = snr.nextDouble();
                    salarioAntigo = f[numFun].getSalario();
                    f[numFun].aumentarSalario(porcentagem);
                    System.out.printf("Salário antigo R$ %.2f -> Novo Salário R$ %.2f%n",salarioAntigo, f[numFun].getSalario());
                    System.err.println();
                    escolha = showMenu();
                    System.err.println();
                    break;
                case 2:
                    System.out.println("Escolha o Funcionario pelo número: ");
                    for (i = 0; i < 5; i++) {
                        System.out.println(i+". "+f[i].getNome());
                    }
                    System.out.print("Escolha: ");
                    System.err.println();
                    numFun = snr.nextInt();
                    System.out.print("Você irá ver os dados do Funcionário "+f[numFun].getNome()+": ");
                    f[numFun].exibirDados();
                    System.err.println();
                    escolha = showMenu();
                    System.err.println();
                    break;
            }
        }while(escolha > 0 && escolha < 3);
        
        snr.close();
    }
}
