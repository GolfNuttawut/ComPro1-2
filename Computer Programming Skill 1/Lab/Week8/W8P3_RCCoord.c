#include <stdio.h>
void main()
{
      int R,C,F=0;
    scanf("%d%d",&R,&C);
    while(F<=R)
    {
        int B=0;
        while(B<=C)
        {
            printf("(%d, %d) ",F,B);
            B++;
        }
        printf("\n");
        F++;
    }
}
