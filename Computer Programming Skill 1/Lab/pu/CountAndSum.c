#include <stdio.h>
void main()
{
    int K,X,i=0,j=0,sum=0;
    scanf("%d",&K);
    while(1)
    {
        scanf("%d",&X);
        if(X==0)
        {
            break;
        }
        else
        {
            i++;
            if(X>0)
            {
                if(X%K==0)
                {
                    j++;
                    sum = sum + X;
                }
            }
        }
     }
    printf("%d\n",i);
    printf("%d\n",j);
    printf("%d",sum);
}
