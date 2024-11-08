#include <stdio.h>
void main()
{
    int K, K1, K2, S1, S2, G;
    scanf("%d%d%d%d%d%d",&K,&K1, &K2, &S1, &S2, &G);

    if(S1>8 && S2>8 && G==1 && K1<K)
    {
        printf("1");
    }
    else if(S1>8 && S2>8 && G==1 && K1==K && K2<K)
    {
        printf("2");
    }
    else  if(S1>8 && S2>8 && G==2 && K2<K)
    {
        printf("2");
    }
    else  if(S1>8 && S2>8 && G==2 && K2==K && K1<K)
    {
        printf("1");
    }
    else if(S1>8 && G==1 && K1<K)
    {
        printf("1");
    }
    else if(S1>8 && G==1 && K1==K && K2<K)
    {
        printf("2");
    }else if(S2>8 && G==2 && K2<K)
    {
        printf("2");
    }
    else  if(S2>8 && G==2 && K2==K && K1<K)
    {
        printf("1");
    }
    else if (S1>8 && S2<=8 && G==2 && K1<K)
    {
        printf("1");
    }
    else if (S2>8 && S1<=8 && G==1 && K2<K)
    {
        printf("2");
    }
    else
    {
        printf("0");
    }
}
