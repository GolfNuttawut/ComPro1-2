#include <stdio.h>
void main()
{
    int n,w1=0,w2=0;
    scanf("%d",&n);
    int p1[n],p2[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&p1[i]);
    }
    for(int i=0;i<n;i++)
    {
        scanf("%d",&p2[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(p1[i]==p2[i]){
            w1 = w1 + 0;
            w2 = w2 + 0;
        }
        if(p1[i]==1&&p2[i]==2)
        {
            w2++;
        }
        else if(p1[i]==1&&p2[i]==3)
        {
            w1++;
        }
        else if(p1[i]==2&&p2[i]==1)
        {
            w1++;
        }
        else if(p1[i]==2&&p2[i]==3)
        {
            w2++;
        }
        else if(p1[i]==3&&p2[i]==2)
        {
            w1++;
        }
        else if(p1[i]==3&&p2[i]==1)
        {
            w2++;
        }
    }
    printf("%d %d\n",w1,w2);
        if(w1>w2)
        {
            printf("1");
        }
        else if(w1<w2)
        {
            printf("2");
        }
        else
        {
            printf("0");
        }
}


