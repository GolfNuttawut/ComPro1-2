#include <stdio.h>
int arr[50000];
void main()
{
    int N,chang;
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//รับค่าสมาชิกของ arr
        arr[i] = arr[i]*arr[i];//ยกกำลัง 2
    }
    for(int i=0;i<N;i++)//เรียงลำดับ
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
        arr[i] = arr[i]+arr[i-1];//หาผลรวม
        printf("%d ",arr[i]);
    }
}
