#include <stdio.h>
#include <math.h>

void retangulo(double *dadoRetangulo, char parteRetangulo[]) {
    printf("Digite %s do retângulo: ", parteRetangulo);
    scanf("%lf", dadoRetangulo);
}

int main() {
    double largura, comprimento, perimetro, area, tridimensionalArea, diagonal;
    retangulo(&largura, "a largura");
    retangulo(&comprimento, "o comprimento");
    perimetro = 2*(largura + comprimento);
    area = largura * comprimento;
    tridimensionalArea = 2*(pow(largura, 2)) + 4*(comprimento * largura);
    diagonal = sqrt(pow(largura, 2) + pow(comprimento, 2));
    printf("Perímetro: %.2lf\n", perimetro);
    printf("Área: %.2lf\n", area);
    printf("Área Tridimensional: %.2lf\n", tridimensionalArea);
    printf("Diagonal: %.2lf\n", diagonal);
    return 0;
}