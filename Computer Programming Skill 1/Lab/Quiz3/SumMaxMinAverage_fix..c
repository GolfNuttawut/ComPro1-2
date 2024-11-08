#include <stdio.h>
#include <limits.h>
void main()
{
    int n ,k ,max=INT_MIN ,min=INT_MAX ,max_row ,min_row ,sum,cnt=0;
    double sum_all =0;
    for(int i=0 ; 1 ; i++)
    {
        sum=0;
        scanf("%d",&n);
        if(n <= 0)
        {
            break;
        }
        cnt++;
        for(int j=0 ; j<n ;j++)
        {
            scanf("%d",&k);
            sum += k;
        }
        printf("%d\n",sum);
        if(sum>=max)
        {
            max = sum;
            max_row = i+1;
        }
        if(sum<=min)
        {
            min = sum;
            min_row = i+1;
        }
        sum_all += sum;
    }
    printf("%d %d\n",max_row,max);
    printf("%d %d\n",min_row,min);
    printf("%.2f",sum_all/cnt);
}
