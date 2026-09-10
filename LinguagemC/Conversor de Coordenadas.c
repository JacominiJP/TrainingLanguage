#include <stdio.h>
#include <string.h>

int main() {

    int mundo, X, Z;
    double conversorX, conversorZ;

    X = 0;
    Z = 0;
    conversorX = 0;
    conversorZ = 0;

    printf("Em qual Mundo Se Localiza? \n");
    printf("1 - OverWord\n2 - Nether\n");
    scanf("%d", &mundo );

    if (mundo == 1) {
        printf("Coordenadas de OverWord --> Nether\n");
        printf("Coordenada X: ");
        scanf("%d", &X);
        printf("Coordenada Z: ");
        scanf("%d", &Z);
        conversorX = X / 8;
        conversorZ = Z / 8;
        printf("Suas Coordenadas Do Nether e: X = %.0lf e Z = %.0lf", conversorX, conversorZ );

    } else if (mundo == 2) {
        printf("Coordenadas de Nether --> OverWord\n");
        printf("Coordenada X: ");
        scanf("%d", &X);
        printf("Coordenada Z: ");
        scanf("%d", &Z);
        conversorX = X * 8;
        conversorZ = Z * 8;
        printf("Suas Coordenadas Do OverWord e: X = %.0lf e Z = %.0lf", conversorX, conversorZ );
    }


    return 0;
}
