#include <stdio.h>
int arr[10000];
void main()
{
    int N;
    double sum=0.0,avr;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
        sum += arr[i];
    }
    avr = sum/(N*1.0);
    printf("%lf",avr);
}
