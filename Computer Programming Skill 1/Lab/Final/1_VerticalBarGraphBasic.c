#include <stdio.h>
#include <limits.h>
void main()
{
    int N,MAX=INT_MIN;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]>MAX)
        {
            MAX = arr[i];
        }
    }
    int Loop=MAX;
    for(int i=0;i<Loop;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(arr[j]>=MAX)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
        MAX--;
    }
}
