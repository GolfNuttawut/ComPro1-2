#include <stdio.h>
void main()
{
    int N,T,C=0;
    scanf("%d",&N);
      int x[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
    }
    scanf("%d",&T);
    for(int i=0;i<N;i++)
    {
        if(x[i]==T)
        {
            printf("%d ",i+1);
            C++;
        }
    }
    if(C==0)
    {
        printf("0");
    }
}
