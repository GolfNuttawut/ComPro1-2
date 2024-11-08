#include <stdio.h>
void main()
{
    int N,X;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d",&X);
        if(X%2==0)
        {
            for(int i=0;i<X;i++)
            {
                printf("#");
            }
        }
        else
            for(int i=0;i<X;i++)
            {
                printf("*");
            }
        printf("\n");
    }
}
