#include <stdio.h>
int arr[501];
void main()
{
    int cnt=0;
    for(int i=0;1;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]<0 || arr[i]>9)
        {
            break;
        }
        cnt++;
    }
    int space = cnt-1,point=1;
    for(int i=0;i<cnt;i++)
    {
        for(int j=0;j<space;j++)
        {
            printf(" ");
        }
        for(int k=0;k<point;k++)
        {
            printf("%d",arr[i]);
        }
        printf("\n");
        space--,point++;
    }
}
