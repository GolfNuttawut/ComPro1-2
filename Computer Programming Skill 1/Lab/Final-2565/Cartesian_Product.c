#include <stdio.h>
void main()
{
    int N,K;
    scanf("%d%d",&N,&K);
    int A[N],B[K];//เเนะนำประกาศไว้นอก main >> int A[50000],B[50000];
    for(int i=0;i<N;i++)//สมาชิกของ A
    {
        scanf("%d",&A[i]);//รับค่าสมาชิก
    }
    for(int j=0;j<K;j++)//สมาชิกของ B
    {
        scanf("%d",&B[j]);//รับค่าสมาชิก
    }
    int C,count=0;
    scanf("%d",&C);
    if( C>0 && C%2==0)//C= จำนวนคู่ + (A x B)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<K;j++)
            {
                printf("(%d, %d)",A[i],B[j]);
                count++;//n
                if(i==N-1 && j==K-1)//เมื่อถึงจำนวนสุดท้ายไม่ต้องเพิมพ์ลูกน้ำ
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C>0 && C%2!=0)//C = จำนวนคี่ + >>(B x A)
    {
         for(int i=0;i<K;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("(%d, %d)",B[i],A[j]);
                count++;//n
                if(i==K-1 && j==N-1)//เมื่อถึงจำนวนสุดท้ายไม่ต้องเพิมพ์ลูกน้ำ
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C<0 && C%2==0)//C = จำนวนคู่ - >>(A x A)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                printf("(%d, %d)",A[i],A[j]);
                count++;//n
                if(i==N-1 && j==N-1)//เมื่อถึงจำนวนสุดท้ายไม่ต้องเพิมพ์ลูกน้ำ
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    else if( C<0 && C%2!=0)//C = จำนวนคี่ - >>(B x B)
    {
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<K;j++)
            {
                printf("(%d, %d)",B[i],B[j]);
                count++;//n
                if(i==K-1 && j==K-1)//เมื่อถึงจำนวนสุดท้ายไม่ต้องเพิมพ์ลูกน้ำ
                {
                    break;
                }
                printf(" , ");
            }
            printf("\n");
        }
    }
    printf("n = %d",count);//เเสดงค่าของ n = ? >> n คือ count
}
