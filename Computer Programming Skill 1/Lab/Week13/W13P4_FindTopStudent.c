#include <stdio.h>
struct std
{
    int score;
};
void main()
{
    int row,col,sum,count=0,max=0,sum_cnt;
    scanf("%d%d",&row,&col);
    struct std sct[row][col];
    for(int r=0;r<row;r++)
    {
        for(int c=0;c<col;c++)
        {
            scanf("%d",&sct[r][c].score);
        }
    }
     for(int r=0;r<row;r++)
    {
        sum = 0;
        count=0;
        for(int c=0;c<col;c++)
        {
            sum = sum + sct[r][c].score;
            if(sct[r][c].score==9)
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
