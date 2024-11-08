#include <stdio.h>
char arr[1000][1000];
void main()
{
    int N,M,B,C;
    scanf("%d",&N);
    double sum=0.0;
    for(int i=0;i<N;i++)
    {
        scanf("%d",&M);
        for(int j=0;j<M;j++)
        {
            scanf("%d%d",&B,&C);
            for(int k=0;k<B;k++)
            {
                if(C==0)
                {
                    printf("#");
                    sum += 9.75;
                }
                else if(C==1)
                {
                    printf("-");
                    sum += 8.50;
                }
            }
        }
         printf("\n");
    }
    printf("%0.2lf",sum);
}
