#include <stdio.h>
void derivative(int* AInput, int* AOutput, const int N)
{
    printf("0 ");
    for(int i=0;i<N-1;i++)
    {
        *AOutput = AInput[i+1] - AInput[i];
        printf("%d ",*AOutput);
    }
}
void main()
{
    int N,AOutout=0;
    scanf("%d",&N);
    int AInput[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&AInput[i]);
    }
    derivative(AInput,&AOutout,N);
}
