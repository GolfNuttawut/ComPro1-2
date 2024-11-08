#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    int arr[N][N];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int sum_down=0,space_1=0;
    for(int i=1;i<N;i++)
    {
        for(int j=0;j<=space_1;j++)
        {
            sum_down = sum_down + arr[i][j];
        }
        space_1++;
    }
    int sum_up=0,con=0;
    for(int i=0;i<N-1;i++)
    {
        con++;
        for(int j=0+con;j<N;j++)
        {
            sum_up = sum_up + arr[i][j];
        }
    }
    printf("%d\n%d",sum_up,sum_down);
}
/*
#include <stdio.h>
int arr[1000][1000];
void main()
{
    int K,sum_up=0,sum_down=0,up=1,down=1;
    scanf("%d",&K);
    for(int i=0;i<K;i++)
    {
        for(int j=0;j<K;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<K;i++)//UP
    {
        for(int j=up;j<K;j++)
        {
            sum_up += arr[i][j];
        }
        up++;
    }
    printf("%d\n",sum_up);
     for(int i=1;i<K;i++)//DOWN
    {
        for(int j=0;j<down;j++)
        {
            sum_down += arr[i][j];
        }
        down++;
    }
    printf("%d",sum_down);
}
*/
