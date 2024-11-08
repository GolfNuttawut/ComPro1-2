#include <stdio.h>
void main()
{
    int N,i=0;
    scanf("%d",&N);
    int x,sum_1000=0,sum_500=0,sum_100=0,sum_50=0,sum_20=0,sum_10=0,sum_5=0,sum_1=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
    while(i<N)
    {
        scanf("%d",&x);
        if(x>=1000)
        {
            sum_1000 = x/1000;
            x = x%1000;
            c1 = c1 +  sum_1000;
        }
        if(x>=500)
        {
            sum_500 = x/500;
            x = x%500;
            c2 = c2 +  sum_500;
        }
        if(x>=100)
        {
            sum_100 = x/100;
            x = x%100;
            c3 = c3 +  sum_100;
        }
        if(x>=50)
        {
            sum_50 =  x/50;
            x = x%50;
            c4 = c4 +  sum_50;
        }
        if(x>=20)
        {
            sum_20 = x/20;
            x = x%20;
            c5 = c5 +  sum_20;
        }
        if(x>=10)
        {
            sum_10 = x/10;
            x = x%10;
            c6 = c6 +  sum_10;
        }
        if(x>=5)
        {
            sum_5 = x/5;
            x = x%5;
            c7 = c7 +  sum_5;
        }
        if(x>=1)
        {
            sum_1 = x/1;
            c8 = c8 +  sum_1;
        }
        i++;
    }
    printf("1000 : %dB\n",c1);
    printf("500 : %dB\n",c2);
    printf("100 : %dB\n",c3);
    printf("50 : %dB\n",c4);
    printf("20 : %dB\n",c5);
    printf("10 : %dB\n",c6);
    printf("5 : %dB\n",c7);
    printf("1 : %dB",c8);
}
