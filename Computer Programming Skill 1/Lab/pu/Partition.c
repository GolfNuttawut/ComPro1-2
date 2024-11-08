#include <stdio.h>
void main()
{
    int W, N;
    scanf("%d %d", &W, &N);
    for(int i = 0; i < (W+1)*N + 1; ++i)
    {
        printf("*");
    }
    printf("\n");
    for(int box = 0; box < N; ++box)
    {
        printf("*");
        for(int i = 0; i < W; ++i)
        {
           printf(" ");
        }
    }
     printf("*\n");
    for(int i = 0; i < (W+1)*N + 1; ++i)
    {
         printf("*");
    }
}
