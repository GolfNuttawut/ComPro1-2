#include <stdio.h>
void main()
{
    int N,K;
    scanf("%d%d",&N,&K);
    int A[N],B[K];//��йӻ�С�����͡ main >> int A[50000],B[50000];
    for(int i=0;i<N;i++)//��Ҫԡ�ͧ A
    {
        scanf("%d",&A[i]);//�Ѻ�����Ҫԡ
    }
    for(int j=0;j<K;j++)//��Ҫԡ�ͧ B
    {
        scanf("%d",&B[j]);//�Ѻ�����Ҫԡ
    }
    int C,count=0;
    scanf("%d",&C);
    if( C>0 && C%2==0)//C= �ӹǹ��� + (A x B)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<K;j++)
            {
                printf("(%d, %d)",A[i],B[j]);
                count++;//n
                if(i==N-1 && j==K-1)//����Ͷ֧�ӹǹ�ش��������ͧ������١���
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C>0 && C%2!=0)//C = �ӹǹ��� + >>(B x A)
    {
         for(int i=0;i<K;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("(%d, %d)",B[i],A[j]);
                count++;//n
                if(i==K-1 && j==N-1)//����Ͷ֧�ӹǹ�ش��������ͧ������١���
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C<0 && C%2==0)//C = �ӹǹ��� - >>(A x A)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("(%d, %d)",A[i],A[j]);
                count++;//n
                if(i==N-1 && j==N-1)//����Ͷ֧�ӹǹ�ش��������ͧ������١���
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C<0 && C%2!=0)//C = �ӹǹ��� - >>(B x B)
    {
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<K;j++)
            {
                printf("(%d, %d)",B[i],B[j]);
                count++;//n
                if(i==K-1 && j==K-1)//����Ͷ֧�ӹǹ�ش��������ͧ������١���
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    printf("n = %d",count);//��ʴ���Ңͧ n = ? >> n ��� count
}
