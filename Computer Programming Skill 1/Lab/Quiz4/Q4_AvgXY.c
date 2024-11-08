#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    int x,y,count=0;
    double sum=0;
    scanf("%d%d",&x,&y);
     for(int i=0;i<N;i++)
    {
        if(arr[i]>=x && arr[i]<=y)
        {
            count++;
            sum = sum + arr[i];
        }
    }
    printf("%d\n",count);
    sum = sum/count;
    if(count==0)
    {
        printf("none");
    }
    else
    {
        printf("%.2f",sum);
    }
}
