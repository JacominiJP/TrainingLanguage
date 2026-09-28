//ESTE OBJETO ESTÁ PROJETADO SOMENTE COM O MÉTODOS DE SAQUE
package processualn1_2p.ex1_caixa_eletronico.Objetos;

public class caixa_eletronico {
   //Atributos
    private int saldo;
    private  int saque;
    //Construtor
    public caixa_eletronico(){
        setSaldo(2000000000);
        this.saque = 0;
    }
    //Getters
    public int getSaldo() {
        return saldo;
    }

    public int getSaque() {
        return saque;
    }
    //Setters
    public void setSaldo(int saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public void setSaque(int saque){
        if (saque > saldo) {
            System.out.println("Seu saldo é menor que o valor de saque, valor do Saque: R$ " + saque + " e seu saldo é: R$ " + saldo);
        } else if (saque < 2) {
            System.out.println("Valor de saque inválido, valor do Saque: R$ " + saque);
            System.out.println("O Valor de saque deve ser maior ou igual a R$ 2,00 e tem que corresponder as notas disponíveis no Caixa Eletrônico");
        } else {
            this.saque = saque;
            System.out.println("O valor do saque é de " + saque);
        }
        
    }

    //Métodos
    private int calcularNota(int valorNota){
        int nota = 0;
        if (saque >= valorNota) {
                nota = saque / valorNota;
                saque -= valorNota * nota;
        }
        return nota;
    }
    public void sacar(){
        int nota200 = 0, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
        saldo -= saque;
        int valorSaque = saque;
        nota200 += calcularNota(200);
        nota100 += calcularNota(100);
        nota50 += calcularNota(50);
        nota20 += calcularNota(20);
        nota10 += calcularNota(10);
        nota5 += calcularNota(5);
        nota2 += calcularNota(2);
        valorSaque -= saque;
       //--------------------------------------//
        System.out.println("As Notas Geradas Foram:");
        System.out.println(nota200 + " notas de R$ 200,00");
        System.out.println(nota100 + " notas de R$ 100,00");
        System.out.println(nota50 + " notas de R$ 50,00");
        System.out.println(nota20 + " notas de R$ 20,00");
        System.out.println(nota10 + " notas de R$ 10,00");
        System.out.println(nota5 + " notas de R$ 5,00");
        System.out.println(nota2 + " notas de R$ 2,00");
        if (saque == 0) {
            System.out.println("O valor total do Saque foi de R$ "+valorSaque+",00" );
        } else {
            System.out.println("Devido ao valor do Saque não corresponder a todas as notas, foi sacado R$ "+ valorSaque +",00, e R$ "+saque+",00 ficou no caixa");
        }       
    }
}
