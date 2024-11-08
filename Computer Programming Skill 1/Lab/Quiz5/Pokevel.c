#include <stdio.h>
struct pokka
{
    int BCU;
    char name[52];
    int level[9];
};
void main()
{
    int n,k;
    scanf("%d",&n);
    struct pokka pok[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&pok[i].BCU);
        scanf("%s",pok[i].name);
        for(int j=1;j<=8;j++)
        {
            scanf("%d",&pok[i].level[j]);
        }
    }
    int tBCU,Tlevel;
    scanf("%d",&k);
    for(int i=0;i<k;i++)
    {
        scanf("%d%d",&tBCU,&Tlevel);
        for(int i=0;i<n;i++)
        {
            if(tBCU == pok[i].BCU)
            {
                printf("%s ",pok[i].name);
                printf("%d\n",pok[i].level[Tlevel]);
            }
        }
    }
}
