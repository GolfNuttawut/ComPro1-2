#include <stdio.h>
int arr[50000];
void main()
{
    int N,sum=0;
    scanf("%d",&N);//รับค่า N >> N = จำนวนสมาชิกที่รับเข้ามา
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//รับค่าสมาชิก
    }
    for(int i=0;i<N;i++)
    {
        sum += arr[i];//ผลบวกต่อเนื่อง
        printf("%d ",sum);
    }
}
