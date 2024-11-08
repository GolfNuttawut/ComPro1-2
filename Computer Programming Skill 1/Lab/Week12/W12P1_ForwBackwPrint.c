#include <stdio.h>
void main()
{
    int N,P;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&P);
    if(P<0)
    {
        for(int i=N-1;i>=0;i--)
        {
            printf("%d ",arr[i]+P);
        }
    }
    else
    {
        for(int i=0;i<N;i++)
        {
            printf("%d ",arr[i]+P);
        }
    }
}
