#include <stdio.h>
struct data
{
    int quiz;
}typedef dada;

struct stu
{
    dada meb[1000];
}typedef st;
void main()
{
    int i,j,max=0,sum=0,n,k,max_i=0,cnt=0,p=0;
    scanf("%d %d",&n,&k);
    st g[n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<k;j++)
        {
            scanf("%d",&g[i].meb[j].quiz);
            sum = sum + g[i].meb[j].quiz;
        }
        if(sum>max)
        {
            max = sum;
            max_i = i;
            sum = 0;
        }
        else
        {
            sum = 0;
        }
    }
    for(i=0;i<k;i++)
    {
        for(j=0;j<n;j++)
        {
            if(g[max_i].meb[i].quiz>=g[j].meb[i].quiz)
            {
                cnt++;
            }
        }
        if(cnt==n)
        {
            p++;
            cnt = 0;
        }
        else
        {
            cnt = 0;
        }
    }
    printf("%d\n",max);
    printf("%d",p);
}
