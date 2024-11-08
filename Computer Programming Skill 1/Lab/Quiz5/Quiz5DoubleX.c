#include <stdio.h>
char arr[5000][5000];
void main()
{
    int R,C,Left,Right,Count=0;
    scanf("%d%d",&R,&C);
    Left=0,Right=R-1;
     for(int row=0;row<R;row++) //Set Space
    {
        for(int col=0;col<C;col++)
        {
            arr[row][col] = ' ';
        }
    }
    for(int row=0;row<R;row++)//*
    {
        for(int col=Left;col<=Left;col++)//Left
        {
            arr[row][col] ='*';
        }
        for(int col=Right;col<=Right;col++)//Right
        {
            arr[row][col] ='*';
        }
        Left++;
        Right--;
    }
    if(R*2<=C)//Non-Overlap
    {
        Left=C-R,Right=C-1;
        for(int row=0;row<R;row++)
        {
            for(int col=Left;col<=Left;col++)
            {
                arr[row][col] ='#';
            }
            for(int col=Right;col<=Right;col++)
            {
                arr[row][col] ='#';
            }
        Left++;
        Right--;
        }
    }
    else//R*2>C (Overlap)
    {
        Left=C-R,Right=C-1;
        for(int row=0;row<R;row++)
        {
            for(int col=Left;col<=Left;col++)
            {
                if(arr[row][col]!= ' ')
                {
                    Count++;
                }
                arr[row][col] ='#';
            }
            for(int col=Right;col<=Right;col++)
            {
                if(arr[row][col]!= ' ' && arr[row][col] != '#')
                {
                    Count++;
                }
                arr[row][col] ='#';
            }
        Left++;
        Right--;
        }
    }
    for(int row=0;row<R;row++)//Print
    {
        for(int col=0;col<C;col++)
        {
            printf("%c",arr[row][col]);
        }
        printf("\n");
    }
    printf("%d",Count);
}
