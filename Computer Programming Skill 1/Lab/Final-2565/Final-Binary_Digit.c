#include <stdio.h>
int arr[50000];//����������Ҩ������˹�������ҹ������⨷���˹���� N ����Թ 1M
void main()
{
    int N,fraction,count=0;//N = ��ҷ���Ѻ����� ,faction = ��� , count = �ӹǹ��ѡ�ͧ�Ţ�ҹ 2
    scanf("%d",&N);//�Ѻ��� N
    for(int i=0;1;i++)//�ٻ͹ѹ��
    {
        if(N==0)//��� N==0 ��騺�ٻ
        {
            break;
        }
        fraction = N%2; //��ɨҡ�����ô��� 2
        N = N/2; // �ӹǹ��� 2 �����
        arr[i] = fraction; //�෹���
        count++; //�Ѻ��ѡ
    }
    for(int i=count-1;i>=0;i--)// ���§�ҡ��ҧ��ѧ仢�ҧ˹�� <<count -1 �����������Ѻ 0 ���ӴѺ��á>>
    {
        printf("%d",arr[i]); //��ʴ���
    }
}
