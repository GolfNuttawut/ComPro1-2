#include <stdio.h>
void main()
{
    int N,sum;
    scanf("%d",&N);
    sum = N/3;
    for(int i=0;i<sum;i++)
    {
        int space = 0;
        for(int j=0;j<3;j++)
        {
            for(int j=0;j<space;j++)
            {
                printf(" ");
            }
            for(int j=0;j<sum;j++)
            {
                printf("*  ");
            }
            printf("\n");
            space++;
        }
    }
}
