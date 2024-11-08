#include <stdio.h>
void main()
{
    int Candidate,People,max=-1;
    scanf("%d%d",&Candidate,&People);
    int Vote[People],Number[Candidate];
    for(int i=0;i<People;i++)
    {
        scanf("%d",&Vote[i]);
    }
    int count,Top,Score;
     for(int j=1;j<=Candidate;j++)
    {
        count=0;
        for(int i=0;i<People;i++)
        {
            if(Vote[i]==j)
            {
                count++;
            }
        }
        if(count>max)
        {
            max = count;
            Top = j;
            Score = count;
        }
    }
    printf("%d\n%d",Top,Score);
}
