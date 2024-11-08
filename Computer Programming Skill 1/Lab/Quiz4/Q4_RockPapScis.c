#include <stdio.h>
void main()
{
    int x[2];
    for(int i;i<2;i++)
    {
        scanf("%d",&x[i]);
    }
    if(x[0]==1&&x[1]==1)
    {
        printf("0");
    }
     else if(x[0]==1&&x[1]==2)
    {
        printf("2");
    }
    else if(x[0]==1&&x[1]==3)
    {
        printf("1");
    }
     else if(x[0]==2&&x[1]==1)
    {
        printf("1");
    }
      else if(x[0]==2&&x[1]==2)
    {
        printf("0");
    }
     else if(x[0]==2&&x[1]==3)
    {
        printf("2");
    }
     else if(x[0]==3&&x[1]==1)
    {
        printf("2");
    }
     else if(x[0]==3&&x[1]==2)
    {
        printf("1");
    }
      else if(x[0]==3&&x[1]==3)
    {
        printf("0");
    }
  }
