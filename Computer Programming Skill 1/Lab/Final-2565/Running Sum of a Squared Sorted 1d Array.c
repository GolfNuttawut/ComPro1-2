#include <stdio.h>
int arr[50000];
void main()
{
    int N,chang;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//�Ѻ�����Ҫԡ�ͧ arr
        arr[i] = arr[i]*arr[i];//¡���ѧ 2
    }
    for(int i=0;i<N;i++)//���§�ӴѺ
    {
        for(int j=i;j<N;j++)
        {
            if(arr[j]<=arr[i])
            {
                chang = arr[j];
                arr[j] = arr[i];
                arr[i] = chang;
            }
        }
    }
     for(int i=0;i<N;i++)
    {
        arr[i] = arr[i]+arr[i-1];//�Ҽ����
        printf("%d ",arr[i]);
    }
}
