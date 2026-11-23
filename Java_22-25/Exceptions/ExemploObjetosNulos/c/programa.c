#include <stdio.h>

int main(void) {
    int inteiro;
    long longo;
    short curto;
    char caractere;
    float real;
    double real_duplo;
    int vetor[4];

    printf("int     : %d\n", inteiro);
    printf("long    : %ld\n", longo);
    printf("short   : %d\n", curto);
    printf("char    : %d\n", caractere);
    printf("float   : %f\n", real);
    printf("double  : %f\n", real_duplo);
    printf("int[4]  : %d %d %d %d\n", vetor[0], vetor[1], vetor[2], vetor[3]);

    return 0;
}
