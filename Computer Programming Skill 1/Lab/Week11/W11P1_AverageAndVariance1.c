#include <stdio.h>
double average(int* array)
{
    int sum=0;
   for(int j=0;j<8;j++)
    {
        sum = sum + array[j];
    }
    return sum/8.0;
}
double variance(int* array, double avg)
{
     double sum=0;
   for(int j=0;j<8;j++)
    {
        sum = sum + (array[j]-avg)*(array[j]-avg);
    }
    return sum/(8-1);
}
void main()
{
    int x[8];
    for(int i=0;i<8;i++)
    {
        scanf("%d",&x[i]);
    }
    printf("%.2f ",average(x));
    printf("%.2f",variance(x,average(x)));
}

