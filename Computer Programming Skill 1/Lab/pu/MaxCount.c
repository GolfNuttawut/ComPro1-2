#include <stdio.h>
#include <limits.h>
void main()
{
    int k,x,cnt_mod=0,N,max_idx,max=0;
    scanf("%d%d",&k,&N);
    for(int i=1;i<=N;i++)
    {
        cnt_mod = 0;
        while(1)
        {
            scanf("%d",&x);
            if(x==0)
                break;
            if(x%k==0 && x>0)
            {
                cnt_mod++;
            }
        }
         if(max<=cnt_mod)
                {
                    max = cnt_mod;
                    max_idx = i;
                }
    }
    printf("%d %d",max_idx,max);
}
