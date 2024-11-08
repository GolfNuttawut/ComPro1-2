#include <stdio.h>
int arr[50000];
void main()
{
    int N,chang;
    scanf("%d",&N);//รับค่า N >> N = จำนวนสมาชิกที่รับเข้ามา
    for(int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);//รับค่าสมาชิก
        arr[i] = arr[i]*arr[i];//กำลัง 2 (ใช้ฟังก์ชัน "math.h" ได้ เเต่ในข้อสอบใช้ไม่ได้)
    }
    //เรียงลำดับจากน้อยไปมาก
    for(int i=0;i<N;i++)
    {
        for(int j=i;j<N;j++)
        {
            if(arr[j]<=arr[i])
            {
                //การสลับค่า
                chang = arr[j];
                arr[j] = arr[i];
                arr[i] = chang;
            }
        }
        printf("%d ",arr[i]);
    }
}
