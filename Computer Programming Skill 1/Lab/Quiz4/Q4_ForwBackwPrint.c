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
    int M;
    scanf("%d",&M);
    for(int i=0;i<N;i++)
    {
        x[i]=x[i]+M;
    }
     if(M>=0)
     {
         for(int i=0;i<N;i++)
        {
            printf("%d ",x[i]);
        }
     }
      else if(M<0)
     {
         for(int i=N-1;i>=0;i--)
        {
            printf("%d ",x[i]);
        }
     }
}
