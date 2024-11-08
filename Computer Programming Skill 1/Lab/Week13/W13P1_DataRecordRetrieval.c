#include <stdio.h>
struct BCU
{
    char ID[9];
    char Name[31];
    char Surname[51];
    int year;
}typedef ppt;
void main()
{
    int n,r,count=0;
    scanf("%d",&n);
    struct BCU student[n];
    for(int i=0;i<n;i++)
    {
        scanf("%s",student[i].ID);
        scanf("%s",student[i].Name);
        scanf("%s",student[i].Surname);
        scanf("%d",&student[i].year);
    }
    scanf("%d",&r);
    for(int i=0;i<n;i++)
    {
        if(student[i].year==r)
        {
            printf("%s ",student[i].ID);
            printf("%s ",student[i].Name);
            printf("%s\n",student[i].Surname);
            count++;
        }
    }
    if(count==0)
    {
        printf("None");
    }
}
