#include <stdio.h>
int  arr[1000][1000],sum_arr[1000];
void main()
{
    int R,C;
    scanf("%d%d",&R,&C);
    for(int i=0;i<C;i++)
    {
        for(int j=0;j<R;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    int sum,count=0;
    for(int i=0;i<R;i++)
    {
        sum =0;
        for(int j=0;j<C;j++)
        {
            printf("%d ",arr[j][i]);
            sum=sum+arr[j][i];
        }
        sum_arr[i]=sum;
        printf("%d",sum_arr[i]);
        printf("\n");
        count++;
    }
    double average=0;
   for(int i=0;i<count;i++)
   {
       average = average + sum_arr[i];
   }
   average = average/count;
   printf("average = %.2f\n",average);
   int pass=0;
   for(int i=0;i<count;i++)
   {
       if(sum_arr[i]>=average)
       {
           pass++;
       }
   }
   printf("pass %d\n",pass);
   for(int i=0;i<count;i++)
   {
       if(sum_arr[i]>=average)
       {
           printf("%d ",i+1);
       }
   }
}
