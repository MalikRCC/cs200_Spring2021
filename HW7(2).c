#include <stdio.h>

int main()
{
    double Big, Cheese, product;
    printf("Enter two values: ");
    scanf("%lf %lf", &Big, &Cheese);
    
    product = Big * Cheese;
    
    printf("product = %.2lf", product);
    
    return 0;
}
