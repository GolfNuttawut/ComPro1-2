#include <stdio.h>
int arr[50000];
void main()
{
    int N,sum=0;
    scanf("%d",&N);//�Ѻ��� N >> N = �ӹǹ��Ҫԡ����Ѻ�����
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//�Ѻ�����Ҫԡ
    }
    for(int i=0;i<N;i++)
    {
        sum += arr[i];//�źǡ������ͧ
        printf("%d ",sum);
    }
}
