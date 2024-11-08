#include <stdio.h>
void main()
{
    int n,cnt=0,i=0;
    for(;;)
    {
        scanf("%d",&n);
        if(n==4)
        {
            printf("Alert!! Porn contents\n");
            cnt++;
        }
        if(n==-1)
        {
            break;
        }
        i++;
    }
    if((cnt*100)/i>=60)
    {
        printf("The user was banned\n");
    }
}
