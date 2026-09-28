package processualn1_2p.ex5_sistema_de_contas_bancarias;
import java.util.Scanner;
import processualn1_2p.ex5_sistema_de_contas_bancarias.Objeto.ContaCorrente;
import processualn1_2p.ex5_sistema_de_contas_bancarias.Objeto.ContaPoupanca;
public class main {
    public static int showMenu(){
        int escolha;
        Scanner snr = new Scanner(System.in);
        do{
            System.out.println("### MENU BANCO ###");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Exibir Contas");
            System.out.println("4. Sacar");
            System.out.println("5. Depositar");
            System.out.println("6. Calcular Saldo Contas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            escolha = snr.nextInt();
            System.out.println();
        }while (escolha < 0 || escolha > 6);
        return escolha;
    }
    public static void main(String[] args){
        Scanner snr = new Scanner(System.in);
        int i, escolha, numeroCC = -1, numeroCP = -1;
        String titular;
        double valor;
        ContaCorrente[] cc = new ContaCorrente[500];
        ContaPoupanca[] cp = new ContaPoupanca[500];
        escolha = showMenu();

        do{
            switch (escolha) {
                case 1:
                    System.out.println("Nome do titular da conta: ");
                    titular = snr.nextLine();
                    System.out.println();
                    numeroCC += 1;
                    cc[numeroCC] = new ContaCorrente((numeroCC+1), titular);
                    System.out.println("Conta Criada, Veja as Informações: ");
                    System.out.println("Nome Titular: "+cc[numeroCC].getTitular());
                    System.out.println("Numero da Conta: "+cc[numeroCC].getNumero());
                    System.out.println();
                    escolha = showMenu();
                    break;
            
                case 2:
                    System.out.println("Nome do titular da conta: ");
                    titular = snr.nextLine();
                    System.out.println();
                    numeroCP += 1;
                    cp[numeroCP] = new ContaPoupanca((numeroCP+1), titular);
                    System.out.println("Conta Criada, Veja as Informações: ");
                    System.out.println("Nome Titular: "+cp[numeroCP].getTitular());
                    System.out.println("Numero da Conta: "+cp[numeroCP].getNumero());
                    System.out.println();
                    escolha = showMenu();
                    break;
                case 3:
                    if (numeroCP < 0 || numeroCC < 0){
                        System.out.println("Você não Possui nenhuma Conta Registrada!");
                        System.out.println();
                    }else{
                        System.out.println("Você possui "+ (numeroCC+1)+" Contas Corrente e "+(numeroCP+1)+" Conta Poupança: ");
                        System.out.println("Contas Correntes: ");
                        if (numeroCC <= 0){
                            System.out.println("Não Possui Contas Correntes: ");
                        } else{
                            for (i = 0; i < numeroCC+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cc[i].getTitular());
                                System.out.println("Número da Conta: "+cc[i].getNumero());
                                System.out.printf("Saldo: R$ %.2f%n", cc[i].getSaldo());
                                System.out.println();
                            }
                        }

                        System.out.println("Contas Poupança: ");
                        if (numeroCP <= 0){
                            System.out.println("Não Possui Contas Poupança: ");
                        } else{
                            for (i = 0; i < numeroCP+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cp[i].getTitular());
                                System.out.println("Número da Conta: "+cp[i].getNumero());
                                System.out.printf("Saldo: R$ %.2f%n", cp[i].getSaldo());
                                System.out.println();
                            }
                        }
                    }
                    escolha = showMenu();
                    break;
                case 4:
                    System.out.println("Deseja sacar na conta corrente(1) ou conta poupança(2)?");
                    escolha = snr.nextInt();
                    if (escolha == 1){
                        System.out.println("Qual Conta deseja sacar?");
                        for (i = 0; i < numeroCC+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cc[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cc[i].getSaldo());
                                System.out.println();
                            }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.print("Escolha Valor a Sacar: ");
                        valor = snr.nextDouble();
                        cc[escolha -1].sacar(valor);
                        System.out.println();
                        System.out.printf("Foi sacado R$ %.2f da Conta %d %n", valor, escolha);
                        System.out.printf("Saldo da Conta Corrente Agora é de R$ %.2f%n", cc[escolha-1].getSaldo());
                    } else if(escolha == 2){
                        System.out.println("Qual Conta deseja sacar?");
                        for (i = 0; i < numeroCP+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cp[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cp[i].getSaldo());
                                System.out.println();
                                }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.print("Escolha Valor a Sacar: ");
                        valor = snr.nextDouble();
                        cp[escolha -1].sacar(valor);
                        
                        System.out.println();
                        System.out.printf("Foi sacado R$ %.2f da Conta %d %n", valor, escolha);
                        System.out.printf("Saldo da Conta Poupança Agora é de R$ %.2f%n", cp[escolha-1].getSaldo());
                    }  
                        escolha = showMenu();
                        break;
                case 5:
                    System.out.println("Deseja Depositar na conta corrente(1) ou conta poupança(2)?");
                    escolha = snr.nextInt();
                    if (escolha == 1){
                        System.out.println("Qual Conta deseja Depositar?");
                        for (i = 0; i < numeroCC+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cc[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cc[i].getSaldo());
                                System.out.println();
                            }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.print("Escolha Valor a Depositar: ");
                        valor = snr.nextDouble();
                        cc[escolha -1].depositar(valor);
                        System.out.println();
                        System.out.printf("Foi Depositado R$ %.2f da Conta %d %n", valor, escolha);
                        System.out.printf("Saldo da Conta Corrente Agora é de R$ %.2f%n", cc[escolha-1].getSaldo());
                    } else if(escolha == 2){
                        System.out.println("Qual Conta deseja Depositar?");
                        for (i = 0; i < numeroCP+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cp[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cp[i].getSaldo());
                                System.out.println();
                                }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.print("Escolha Valor a Depositar: ");
                        valor = snr.nextDouble();
                        cp[escolha -1].depositar(valor);
                        
                        System.out.println();
                        System.out.printf("Foi Depositado R$ %.2f da Conta %d %n", valor, escolha);
                        System.out.printf("Saldo da Conta Poupança Agora é de R$ %.2f%n", cp[escolha-1].getSaldo());
                    }  
                    escolha = showMenu();
                    break;
                case 6:
                    System.out.println("Deseja Calcular o Saldo na conta corrente(1) ou conta poupança(2)?");
                    escolha = snr.nextInt();
                    if (escolha == 1){
                        System.out.println("Qual Conta deseja Calcular?");
                        for (i = 0; i < numeroCC+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular"+cc[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cc[i].getSaldo());
                                System.out.println();
                            }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.println();
                        valor = cc[escolha-1].getSaldo();
                        cc[escolha-1].calcularSaldo();
                        System.out.printf("Seu Saldo Antigo era de R$ %.2f%n",valor);
                        System.out.printf("Seu atual Saldo depois da taxa de manutenção de R$ 2,50 é de R$ %.2f%n", cc[escolha-1].getSaldo());
                        
                    } else if(escolha == 2){
                        System.out.println("Qual Conta deseja Calcular?");
                        for (i = 0; i < numeroCP+1; i++){
                                System.out.println((i+1)+"º Conta:");
                                System.out.println("Nome do Titular: "+cp[i].getTitular());
                                System.out.printf("Saldo: R$ %.2f%n",cp[i].getSaldo());
                                System.out.println();
                                }
                        System.out.print("Escolha Conta: ");
                        escolha = snr.nextInt();
                        System.out.println();
                        valor = cp[escolha-1].getSaldo();
                        cp[escolha-1].calcularSaldo();
                        System.out.printf("Seu Saldo Antigo era de R$ %.2f%n ",valor);
                        System.out.printf("Seu atual Saldo depois da rentabilidade de 5%% é de R$ %.2f%n", cp[escolha-1].getSaldo());
                        
                    }  
                    escolha = showMenu();
                    break;
            }
        }while(escolha !=0);   
        snr.close();
    }
}
