#include <stdio.h>  
#include <string.h> 

void terreno( char parteTerreno[], double *infoTerreno) {
        printf("Digite %s do terreno: ", parteTerreno);
        scanf("%lf", infoTerreno);
    }

int main() {
     double largura, comprimento, valorMetro, calculoArea, calculoValor;
     char L[] = "a largura", C[] = "o comprimento", V[] = "o valor do metro quadrado";

    terreno(L, &largura);
    terreno(C, &comprimento);  
    terreno(V, &valorMetro);

    calculoArea = largura * comprimento;
    calculoValor = calculoArea * valorMetro;

    printf("A área do terreno é de %.2lf metros quadrados e o valor do terreno é de R$ %.2lf\n", calculoArea, calculoValor);


    return 0;
}