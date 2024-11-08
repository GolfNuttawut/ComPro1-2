#include <stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int col=0 ; col < n ; col++)
    {
        printf("*");
    }
    printf("\n*");
    for(int col=0 ; col < n-2 ; col++)
    {
        printf(" ");
    }
     printf("*\n");
     for(int row=0 ; row < n-4 ; row++)
    {
        printf("* ");
        for(int col=0 ; col < n-4 ; col++)
        {
            printf("*");
        }
         printf(" *");
        printf("\n");
    }
    printf("*");
    for(int col=0 ; col < n-2 ; col++)
    {
        printf(" ");
    }
     printf("*\n");
      for(int col=0 ; col < n ; col++)
    {
        printf("*");
    }
}
