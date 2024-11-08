#include <stdio.h>
void main()
{
    int N,P,max=0,vote;
    scanf("%d%d",&N,&P);
    int x[P];
    for(int j=0;j<P;j++)
    {
        scanf("%d",&x[j]);
    }
    for(int i=1;i<=N;i++)
    {
        int cnt=0;
            for(int j=0;j<P;j++)
            {
                if(x[j]==i)
                {
                    cnt++;
                }
            }
            if(cnt>max)
            {
                max = cnt;
                vote = i;
            }
    }
    printf("%d\n%d",vote,max);
}
