#include <stdio.h>
#include <string.h>

int main() {
    double soma = 0, num; 
    char continuar;

    printf("Digite o Primeiro Número para somar: ");
    do {
        scanf("%lf", &num);
        soma = soma + num;
        printf("O RESULTADO DA SOMA NO MOMENTO É: %.2lf\n", soma);
        printf("DESEJA CONTINUAR? (S|N): ");
        scanf(" %c", &continuar);

    } while (continuar == 'S' || continuar == 's');
}