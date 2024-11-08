#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int x[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
    }
    int P;
    scanf("%d",&P);
    for(int j=0;j<N;j=j+P)
    {
        printf("%d ",x[j]);
    }
}
