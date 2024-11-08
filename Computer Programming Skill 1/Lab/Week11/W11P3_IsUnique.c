#include <stdio.h>
 int isUnique(int* arData, int N)
{
    int k,j,count=0;
    for(j=0;j<N;j++)
    {
        count=0;
            for(k=0;k<N;k++)
            {
                if(arData[k]==arData[j])
                {
                   count++;
                   if(count>1)
                   {
                       break;
                   }
                }
            }
            if(count>1)
            {
                break;
            }
    }
    if(count>1)
    {
        return 0;
    }
    else
    {
        return 1;
    }

}
void main()
{
   int N;
   scanf("%d",&N);
   int arData[N];
   for(int i=0;i<N;i++)
   {
       scanf("%d",&arData[i]);
   }
   printf("%d",isUnique(arData,N));
}
