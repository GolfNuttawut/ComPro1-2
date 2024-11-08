#include <stdio.h>
struct Score
{
    int Score_std;
};
void main()
{
    int n;
    double sum=0;
    scanf("%d",&n);
    struct Score std[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&std[i].Score_std);
        sum = sum+std[i].Score_std;
    }
    printf("%lf",sum/n);
}
