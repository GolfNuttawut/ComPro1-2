#include <stdio.h>
void main()
{
    int N,T1=0,T2=0;
    scanf("%d",&N);
      int x[N],y[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
    }
     for(int i=0;i<N;i++)
    {
        scanf("%d",&y[i]);
    }
    for(int i=0;i<N;i++)
    {
        if(x[i]>y[i])
        {
            T1 = T1 + 2;
        }
        else if(x[i]<y[i])
        {
            T2 = T2 + 2;
        }
        else
        {
            T1 = T1 + 1;
            T2 = T2 + 1;
        }
    }
    if(T1>T2)
    {
        printf("Team 1 wins\nScore %d to %d",T1,T2);
    }
    else if(T1<T2)
    {
        printf("Team 2 wins\nScore %d to %d",T2,T1);
    }
    else
    {
        printf("Draw game\nScore %d to %d",T2,T1);
    }
}
