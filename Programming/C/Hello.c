#include<stdio.h>

int main() {
    printf("Hello, world!\n");
    return 0;
}

#include <stdio.h>

int main() {
    int num;
    float fnum;
    char ch;
    double dnum;

    // Taking input
    printf("Enter an integer: ");
    scanf("%d", &num);

    printf("Enter a float: ");
    scanf("%f", &fnum);

    // To avoid newline issue when entering char
    getchar(); // consume leftover newline from previous input

    printf("Enter a character: ");
    scanf("%c", &ch);

    printf("Enter a double: ");
    scanf("%lf", &dnum);

    // Printing values
    printf("\nYou entered:\n");
    printf("Integer: %d\n", num);
    printf("Float: %.2f\n", fnum);
    printf("Character: %c\n", ch);
    printf("Double: %.4lf\n", dnum);

    return 0;
}
