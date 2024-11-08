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
    int T,cnt=0;
    scanf("%d",&T);
    if(T==1)
    {
        for(int i=0;i<N-1;i++)
        {
            cnt++;
            printf("%d ",arr[i+1]-arr[i]);
        }
    }
    else if(T==2)
    {
        for(int i=N-1;i>0;i--)
        {
            cnt++;
            printf("%d ",arr[i-1]-arr[i]);
        }
    }
}
