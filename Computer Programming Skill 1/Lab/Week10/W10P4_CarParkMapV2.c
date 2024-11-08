#include<stdio.h>
void main(){
    int row, col;
    scanf("%d%d", &row, &col);
    int x[row][col];
    for (int r=0; r<row; r++)
    {
        for (int c=0; c<col; c++)
        {
            x[r][c] = 0;
        }
    }
    int n;
    scanf("%d", &n);
    for (int i=0; i<n; i++)
    {
        int r, c;
        scanf("%d%d", &r, &c);
        x[r-1][c-1] = 1;
    }
    for (int r=0; r<row; r++)
    {
        for (int c=0; c<col; c++)
        {
            if (x[r][c] == 1)
            {
                printf("x");
            }
            else
            {
                printf("_");
            }
        }
        printf("\n");
    }
}
