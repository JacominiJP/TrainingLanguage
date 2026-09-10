package batalha;

public class Player {
// Atributos
    private String name;
    private int life;
    private int attack;
//Construtores
    public Player(String name) {
        this.name = name;
        this.life = 100;
        this.attack = 30;
    }
//Getters
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAttack() {
        return attack;
    }
//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        if (life < 0) {
            this.life = 0;
        } else if (life > 100 ) {
            this.life = 100;
        } else {
            this.life = life;
        }
    }

    public void setAttack(int attack) {
        if (attack < 0 || attack > 30) {
            this.attack = 30;
        } else {
            this.attack = attack;
        }
    }
//Métodos

    public void status() {
        System.out.println("---Status do Jogador---");
        System.out.println("Nome do Jogador: " + this.name);
        System.out.println("Vida do Jogador: " + this.life);
        System.out.println("Ataque do Jogador: " + this.attack);
        System.out.println("------------------------");
    }
    
    public void ataque(Monstro monstro) {
        int dano = this.attack;
        monstro.setLife(monstro.getLife() - dano);
        System.out.println(this.name + " acabou de atacar o " + monstro.getName() + " causando " + dano + " de dano!");

    }
}