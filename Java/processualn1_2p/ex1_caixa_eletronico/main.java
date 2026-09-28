package processualn1_2p.ex1_caixa_eletronico;
import processualn1_2p.ex1_caixa_eletronico.Objetos.caixa_eletronico;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int  valorSacar;
        caixa_eletronico caixa = new caixa_eletronico();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Valor para sacar: ");
        valorSacar = scanner.nextInt();
        caixa.setSaque(valorSacar);
        caixa.sacar();
        scanner.close();

    }
}
