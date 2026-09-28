package processualn1_2p.ex4_funcionarios_com_heranca;
import processualn1_2p.ex4_funcionarios_com_heranca.Objetos.Vendedor;
import processualn1_2p.ex4_funcionarios_com_heranca.Objetos.Gerente;
import java.util.Scanner;
public class main {
    public static int showMenu(){
        int escolha;
        Scanner snr = new Scanner(System.in);
        do {
            System.out.println("Você quer Olhar quais dos Funcionários: ");
            System.out.println("1. Vendedores");
            System.out.println("2. Gerente");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            escolha = snr.nextInt();
        }while(escolha < 0 || escolha > 2);
        return escolha;
    }
    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int escolha, i, numFun;
        double totalVendido, taxa, salarioFinal;
        Gerente[] g = new Gerente[1];
        g[0] = new Gerente("Alfredo Linguiça", 8000);
        Vendedor[] v = new Vendedor[3];
        v[0] = new Vendedor("Ademilton", 2500 );
        v[1] = new Vendedor("Irineldo", 2800);
        v[2] = new Vendedor("Toinho", 1200);
        escolha = showMenu();
        do{
            switch (escolha){
                case 1:
                    System.out.println("Lista dos Funcionários:");
                    for (i = 0; i < 3; i++){
                        System.out.println(i+"º. "+v[i].getNome());
                    }
                    System.out.print("Escolha o Vendedor: ");
                    numFun = snr.nextInt();
                    System.out.println();
                    System.out.printf("Qual o Valor total Vendido pelo funcionário %s em R$: ", v[numFun].getNome());
                    totalVendido = snr.nextDouble();
                    v[numFun].setTotalVendas(totalVendido);
                    System.out.println();
                    salarioFinal = v[numFun].calcularSalario(v[numFun].getComissao());
                    System.out.printf("O Vendedor %s vai ganhar um salario de R$ %.2f este mês%n", v[numFun].getNome(), salarioFinal );
                    escolha = showMenu();
                    break;
                case 2:
                    System.out.println("Lista dos Funcionários:");
                    System.out.println("0º. "+g[0].getNome());
                    System.out.print("Escolha o Gerente: ");
                    numFun = snr.nextInt();
                    if (numFun != 0){
                        numFun = 0;
                    }
                    salarioFinal = g[numFun].calcularSalario(g[numFun].getBonus());
                    System.out.printf("O Gerente, %s ,vai ganhar um salario de R$ %.2f este mês%n", g[numFun].getNome(), salarioFinal );
                    escolha = showMenu();
                    break;
            }
        }while(escolha != 0 );
    }
}
