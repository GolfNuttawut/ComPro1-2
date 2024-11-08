#include<stdio.h>
#include<string.h>
struct data {
    int id;
    char name[52];
    int pri;
    int base;
    int count;
}typedef book;
void main()
{
    int n,p,i,j,order,ider,amout,cntc=0;
    scanf("%d",&n);
    int ttp[n],ttpr[n];
    book sale[n];
    for(i=0;i<n;i++){
        scanf("%d",&sale[i].id);
        scanf(" %99[^\n]", sale[i].name);
        int nameLength = strlen(sale[i].name);
        sale[i].name[nameLength-1] = 0;
        scanf("%d",&sale[i].pri);
        scanf("%d",&sale[i].base);
        sale[i].count = 0;
        ttp[i] = 0;
        ttpr[i] =0;
}
    scanf("%d",&p);
    for(i=0;i<p;i++)
    {
        scanf("%d %d",&order,&ider);
        if(order==1)
        {
            scanf("%d",&amout);
            for(j=0;j<n;j++)
            {
                if(sale[j].id==ider)
                {
                    ttp[j]= ttp[j] + (sale[j].pri*amout);
                    ttpr[j]+= ((sale[j].pri*amout)- (sale[j].base*amout));
                    sale[j].count+=amout;
                }
            }
        }
        else
        {
            for(j=0;j<n;j++)
            {
                if(sale[j].id==ider)
                {
                    printf("%d ",sale[j].id);
                    printf("%s ",sale[j].name);
                    printf("%d ",sale[j].count);
                    printf("%d ",ttp[j]);
                    printf("%d\n",ttpr[j]);
                    cntc++;
                }
            }
            if(cntc==0)
            {
                printf("Error\n");
            }
            else
            {
                cntc = 0;
            }
        }
    }
}
