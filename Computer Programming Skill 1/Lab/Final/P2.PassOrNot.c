#include <stdio.h>
void main()
{
    int arr[2][4],cnt=0;
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<4;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<4;i++)
    {
        if(arr[0][i]<=arr[1][i])
        {
            printf("%d ",i+1);
            cnt++;
        }
    }
    if(cnt==0)
    {
        printf("0\nfail");
    }
    else if(cnt<3)
    {
        printf("\nfail");
    }
    else
    {
        printf("\npass");
    }
}
