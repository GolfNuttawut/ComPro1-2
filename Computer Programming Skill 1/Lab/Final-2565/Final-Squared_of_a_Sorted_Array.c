#include <stdio.h>
int arr[50000];
void main()
{
    int N,chang;
    scanf("%d",&N);//�Ѻ��� N >> N = �ӹǹ��Ҫԡ����Ѻ�����
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//�Ѻ�����Ҫԡ
        arr[i] = arr[i]*arr[i];//���ѧ 2 (��ѧ��ѹ "math.h" �� ���㹢���ͺ�������)
    }
    //���§�ӴѺ�ҡ������ҡ
    for(int i=0;i<N;i++)
    {
        for(int j=i;j<N;j++)
        {
            if(arr[j]<=arr[i])
            {
                //�����Ѻ���
                chang = arr[j];
                arr[j] = arr[i];
                arr[i] = chang;
            }
        }
        printf("%d ",arr[i]);
    }
}
