#include <stdio.h>
#include <limits.h>
float operate(float *a, float *b, int *c, float *min, float *max, int n)
{
    int i ;
    float sum = 0, result;
    for(i=0;i<n;i++)
    {
        if(c[i] == 1)// C = 1 คือหาผลบวก
        {
            result = a[i] + b[i];
        }
        else if(c[i]==2)// C = 2 คือหาผลลบ
        {
             result = a[i] - b[i];
        }
        else if(c[i]==3)//C = 3 คือหาผลคูณ
        {
             result = a[i] * b[i];
        }
        else if(c[i]==4)//C = 4 คือหาผลหาร
        {
             result = a[i] / b[i];
        }
        //หาค่ามากสุด
        if(result>*max)
        {
            *max = result;
        }
        //หาค่าต่ำสุด
        if(result<*min)
        {
            *min = result;
        }
        sum = sum + result;
    }
    return sum;//ส่งค่ากลับ
}
void main()
{
    int n;
    scanf("%d",&n);//n = จำนวนรอบ
    float a[n],b[n];//ต่าในตำเเหน่งที่ 1 กับ 2
    float max = INT_MIN,min = INT_MAX;
    int c[n];//ค่าในตำเเหน่งที่ 3 (ใช้เช็คเงื่อนไขในฟังก์ชัน)
    for(int i=0;i<n;i++)
    {
        scanf("%f%f%d",&a[i],&b[i],&c[i]);//รับค่าตำเเหน่งที่ 1 2 เเละ 3 ตามลำดับ
    }
    float sum_all = operate(a,b,c,&min,&max,n);//ส่งค่าไปยังฟังก์ชัน
    printf("sum = %.2f\n",sum_all);
    printf("min = %.2f\n",min);
    printf("max = %.2f",max);
}
