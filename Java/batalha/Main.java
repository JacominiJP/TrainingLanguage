package batalha;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite o Nome do Jogador:");
        String playerName = reader.nextLine();
        Player player = new Player(playerName);
        player.status();

        System.out.println("Você Irá Enfrentar um Monstro! Veja Seus Status!");
        Monstro monstro = new Monstro();
        monstro.status();

        while (monstro.getLife() > 0) {
            System.out.print("Deseja atacar o Monstro? (S/N): ");
            char resposta = reader.nextLine().charAt(0);
            while (resposta != 'S' && resposta != 'N') {
                System.out.println("Por favor, só aceitamos exatamente S ou N como resposta válida!");
                System.out.print("Deseja atacar o Monstro? (S/N): ");
                resposta = reader.nextLine().charAt(0);
            }

            if (resposta == 'N') {
                System.out.println("O Player " + player.getName() + "Fugiu da Batalha");
                System.out.println("O MAGO FODASTICO DIZ = 'VOCÊ NN É DIGNO DE SER UM HERÓI! O MONSTRO RIU DA SUA CARA! ENQUANTO VC FUGIA'");
                System.out.println("O MAGO FODASTICO DIZ = 'SEU MERDA!'");
            } else if (resposta == 'S'){
                player.ataque(monstro);
                monstro.vivoMorto();
                monstro.status();
            }
        }
        reader.close();
    }
}