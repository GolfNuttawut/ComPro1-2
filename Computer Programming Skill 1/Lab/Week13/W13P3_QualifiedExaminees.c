#include <stdio.h>
struct std
{
    char codename[6];
    double score;
};
void main()
{
    int n,count=0;
    double sum=0,avr;
    scanf("%d",&n);
    struct std check[n];
    for(int i=0;i<n;i++)
    {
        scanf("%s",check[i].codename);
        scanf("%lf",&check[i].score);
        sum = sum + check[i].score;
    }
    avr = sum/n;
    for(int i=0;i<n;i++)
    {
        if(check[i].score>=avr)
        {
            count++;
        }
    }
    printf("%d\n",count);
    for(int i=0;i<n;i++)
    {
        if(check[i].score>=avr)
        {
            printf("%s\n",check[i].codename);
        }
    }
}
