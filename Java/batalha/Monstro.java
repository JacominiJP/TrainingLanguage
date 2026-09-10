package batalha;

public class Monstro {
//Atributos
    private String name;
    private int life;
//Construtores
    public Monstro() {
        this.name = "HOMEM MISTERIOSO";
        this.life = 200;
    }

//Getters
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
//Setters
    public void setLife(int life) {
        if (life < 0) {
            this.life = 0;
        } else if (life > 200 ) {
            this.life = 200;
        } else {
            this.life = life;
        }
    }
//Métodos
        public void vivoMorto() {
            if (this.life <= 0) {
                System.out.println("PARABÉNS! O MONSTRO CHAMADO " + this.name + " FOI JOGAR NO VASCO!");
            } else {
                System.out.println("O MONSTRO " + this.name + " PERMANECE VIVO! POSSUI " + this.life + " DE VIDA!");
            }
        }
        public void status() {
        System.out.println("---Status do Monstro---");
        System.out.println("Nome do Monstro: " + this.name);
        System.out.println("Vida do Monstro: " + getLife());
        System.out.println("------------------------");
    }
}