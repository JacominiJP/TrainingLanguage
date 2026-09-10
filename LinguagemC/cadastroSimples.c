#include <stdio.h>
#include <stdlib.h>

 void telaInicial(int *opcao) {
    int validacao;
    do {
        printf("----------------------------------------\n");
        printf("0 - CADASTRE-SE\n");
        printf("1 - LOGAR\n");
        printf("2 - SAIR\n");
        printf("----------------------------------------\n");
       validacao = scanf("%d", opcao);
        if (validacao != 1){
            *opcao = -1;
            printf("Entrada inválida. Não utilize letras ou símbolos.\n");
            while (getchar() != '\n');

        } else if(*opcao < 0 || *opcao > 2) {
            printf("Opção inválida. Por favor, escolha um valor de 0 até 2.\n");
            while (getchar() != '\n');
        } 
    }while (*opcao < 0 || *opcao > 2);
    }

    void ler_texto(char *buffer, int length) {
     fgets(buffer, length, stdin);
     strtok(buffer, "\n");
}

    void limpar_entrada() {
        char c;
        while ((c = getchar()) != '\n' && c != EOF) {}
    }

int main() {

    int opcao, cadastroUser = 0, loginUser = 0;
    char userName[100], userPassword[100];
    telaInicial(&opcao);

    switch (opcao) {
        case 0:
            if (cadastroUser == 1) {   
                prinf("Você já possui um cadastro. Escolha a opção de Login (1) para acessar a conta.\n");
                telaInicial(&opcao);
            } else {
                printf("Bem-Vindo ao seu primeiro cadastro!\n");
                prinf("Coloque seu Nome de Usuário: ");
                ler_texto(userName, 100);
                printf("\nColoque sua senha: ");
                limpar_entrada();
                ler_texto(userPassword, 100);
                cadastroUser = 1;
                printf("\nCadastro realizado com sucesso!\n");
                telaInicial(&opcao);
            }
    }

    return 0;
}