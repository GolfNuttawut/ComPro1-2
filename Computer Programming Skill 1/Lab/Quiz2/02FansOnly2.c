#include <stdio.h>
void main()
{
    int n,cnt=0,i=0,count=0,cntcon=0;
    for(;;)
    {
        scanf("%d",&n);
        if(n==4)
        {
            cnt++;
            cntcon++;
        }
        else
        {
            cntcon=0;
        }
        if(cntcon>=3)
        {
            count++;
        }
        if(n==-1)
        {
            break;
        }
        i++;
    }
    if((cnt*100)/i>=60 && count>0)
    {
        printf("The user was banned");
    }
    else if(count>0)
    {
        printf("The user was warned");
    }
    else if((cnt*100)/i>=60)
    {
        printf("The user was warned");
    }
    else
    {
        printf("Pass");
    }
}
