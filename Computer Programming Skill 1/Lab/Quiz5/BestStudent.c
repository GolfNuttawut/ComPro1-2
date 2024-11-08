#include <stdio.h>
struct student_score
{
    char ID[9];
    char name[31];
    char surname[51];
    double score;
};
void main()
{
    int n,target;
    double max=-0.1;
    scanf("%d",&n);
    struct student_score std[n];
    for(int i=0;i<n;i++)
    {
        scanf("%s",std[i].ID);
        scanf("%s",std[i].name);
        scanf("%s",std[i].surname);
        scanf("%lf",&std[i].score);
        if(std[i].score>max)
        {
            max = std[i].score;
            target = i;
        }
    }
    printf("%s ",std[target].ID);
    printf("%s ",std[target].name);
    printf("%s ",std[target].surname);
    printf("%.2lf ",std[target].score);
}
/*
#include <stdio.h>
struct STD_SCORE
{
    char ID[10];
    char Name[31];
    char Surname[51];
    double Score;
};
void main()
{
    int N,top;
    double MAX=0;
    scanf("%d",&N);
    struct STD_SCORE STD_S[N];
    for(int i=0;i<N;i++)
    {
        scanf("%s",STD_S[i].ID);
        scanf("%s",STD_S[i].Name);
        scanf("%s",STD_S[i].Surname);
        scanf("%lf",&STD_S[i].Score);
        if(STD_S[i].Score>MAX)
        {
            MAX = STD_S[i].Score;
            top = i;
        }
    }
    printf("%s ",STD_S[top].ID);
    printf("%s ",STD_S[top].Name);
    printf("%s ",STD_S[top].Surname);
    printf("%.2lf ",STD_S[top].Score);
}
*/
