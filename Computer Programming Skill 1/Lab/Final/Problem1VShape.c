#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int arr[N][N*2];
    int T=0,L=0,R=N*2;
    for(int i=0;i<=N;i++)
    {
        for(int j=0;j<=N*2;j++)
        {
            if(j==L || j==R)
            {
                printf("%d",T);
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
        T++;
        L++;
        R--;
    }
}
