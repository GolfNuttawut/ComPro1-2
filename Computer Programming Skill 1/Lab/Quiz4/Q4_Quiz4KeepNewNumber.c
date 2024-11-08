#include<stdio.h>
void main()
{
    int x[100000];
    int count = 0,difcount = 0 ;
    for(int i = 0 ; 1 ; i++)
    {
        scanf("%d",&x[i]);
        if(x[i] <= 0)
        {
            break ;
        }
        else
        {
            count++ ;
        }
    }
    int y[count];
    int ncount = count ;
    for(int j = 0 ; j < count ; j++)
    {
        y[j] = 0 ;
    }
    for(int i = 0 ; i < count ; i++)
    {
        for(int j = 0 ; j < count ; j++)
        {
            if(x[i] != y[j])
            {
                ncount-- ;
            }
        }
        if(ncount == 0)
        {
            y[i] = x[i] ;
            difcount++ ;
        }
        ncount = count ;
    }
    printf("%d\n",count);
    printf("%d\n",difcount);
    for(int j = 0 ; j < count ; j++)
    {
        if(y[j] != 0)
        {
            printf("%d ",y[j]);
        }
    }
}
