#include <stdio.h>
struct covid_data{
    int id;
    char country[100];
    int num1;
    int num2;
};
void main()
{
    int N,count=0;
    int arr[200];
    scanf("%d",&N);
    struct covid_data cv[N];
    for(int i=0;i<N;i++)
    {
        scanf("%d",&cv[i].id);
        scanf("%s",cv[i].country);
        scanf("%d",&cv[i].num1);
        scanf("%d",&cv[i].num2);
    }
    for(int i=0;1;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]==0)
        {
            break;
        }
        count++;
    }
    for(int i=0;i<count;i++)
    {
        for(int j=0;j<N;j++)
        {
            if(arr[i]==cv[j].id)
            {
                printf("%s ",cv[j].country);
                printf("%d ",cv[j].num1);
                printf("%d\n",cv[j].num2);
            }
        }
    }
}
