#include <stdio.h>
    int N;
double average(int* array)
{
   double sum=0;
   for(int j=0;j<N;j++)
    {
        sum = sum + array[j];
    }
    return sum/N;
}
double variance(int* array, double avg)
{
     double sum=0;
   for(int j=0;j<N;j++)
    {
        sum = sum + (array[j]-avg)*(array[j]-avg);
    }
    return sum/(N-1);
}
void main()
{
     scanf("%d",&N);
    int x[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&x[i]);
    }
    printf("%.2f ",average(x));
    printf("%.2f",variance(x,average(x)));
}

