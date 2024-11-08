#include <stdio.h>
struct quitz
{
    int Q;
}typedef data;
struct
{
    data arr[1000];
}typedef sct;
void main()
{
    int row,col,sum,count=0,max=0,sum_cnt;
    scanf("%d%d",&row,&col);
    sct g[row];
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<col;c++)
        {
            scanf("%d",&g[r].arr[c].Q);
        }
    }
     for(int r=0;r<row;r++)
    {
        sum = 0;
        count=0;
        for(int c=0;c<col;c++)
        {
            sum = sum + g[r].arr[c].Q;
            if(g[r].arr[c].Q==9)
            {
                count++;
            }
        }
        if(sum>max)
        {
            max = sum;
            sum_cnt = count;
        }
    }
    printf("%d\n%d",max,sum_cnt);
}
