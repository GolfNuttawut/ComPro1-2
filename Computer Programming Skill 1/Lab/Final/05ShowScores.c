#include <stdio.h>
struct pin_number {
    char put[15];
};
void main()
{
    int N,K;
    scanf("%d%d",&N,&K);
    int arr[K][N];
    struct pin_number pin[N];
    for(int i=0;i<N;i++)
    {
        scanf("%s",pin[i].put);
    }
    for(int i=0;i<K;i++)
    {
        for(int j=0;j<N;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    double sum;
    for(int i=0;i<N;i++)
    {
        sum=0.0;
        printf("%s ",pin[i].put);
        for(int j=0;j<K;j++)
        {
            sum = sum+(arr[j][i]*1.0);
        }
        sum = sum/K;
        printf("%.2lf\n",sum);
    }
}
