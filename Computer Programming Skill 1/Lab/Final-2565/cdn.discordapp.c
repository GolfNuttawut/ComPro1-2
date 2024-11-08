#include <stdio.h>
#include <limits.h>
float operate(float *a, float *b, int *c, float *min, float *max, int n)
{
    int i ;
    float sum = 0, result;
    for(i=0;i<n;i++)
    {
        if(c[i] == 1)// C = 1 ����Ҽźǡ
        {
            result = a[i] + b[i];
        }
        else if(c[i]==2)// C = 2 ����Ҽ�ź
        {
             result = a[i] - b[i];
        }
        else if(c[i]==3)//C = 3 ����ҼŤٳ
        {
             result = a[i] * b[i];
        }
        else if(c[i]==4)//C = 4 ����Ҽ����
        {
             result = a[i] / b[i];
        }
        //�Ҥ���ҡ�ش
        if(result>*max)
        {
            *max = result;
        }
        //�Ҥ�ҵ���ش
        if(result<*min)
        {
            *min = result;
        }
        sum = sum + result;
    }
    return sum;//�觤�ҡ�Ѻ
}
void main()
{
    int n;
    scanf("%d",&n);//n = �ӹǹ�ͺ
    float a[n],b[n];//���㹵���˹觷�� 1 �Ѻ 2
    float max = INT_MIN,min = INT_MAX;
    int c[n];//���㹵���˹觷�� 3 (�������͹�㹿ѧ��ѹ)
    for(int i=0;i<n;i++)
    {
        scanf("%f%f%d",&a[i],&b[i],&c[i]);//�Ѻ��ҵ���˹觷�� 1 2 ���� 3 ����ӴѺ
    }
    float sum_all = operate(a,b,c,&min,&max,n);//�觤����ѧ�ѧ��ѹ
    printf("sum = %.2f\n",sum_all);
    printf("min = %.2f\n",min);
    printf("max = %.2f",max);
}
