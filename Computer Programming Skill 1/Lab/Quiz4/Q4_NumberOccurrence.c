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
    int T,count=0,cnt=0;
    scanf("%d",&T);
    for(int j=0;j<N;j++)
    {
        count++;
        if(x[j]==T)
        {
            printf("%d ",count);
            cnt++;
        }
    }
    if(cnt==0)
    {
        printf("0");
    }
}
