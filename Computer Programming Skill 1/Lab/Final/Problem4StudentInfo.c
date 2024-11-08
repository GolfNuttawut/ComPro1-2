#include<stdio.h>
void main()
{
    char word[50];
    fgets(word,50,stdin);
    for(int i=0;1;i++)
    {
        if(word[i]=='\n')
        {
            break;
        }
        else if(word[i]>=65 && word[i]<=90)
        {
            word[i] += 32;
        }
        else if(word[i]>=97 && word[i]<=122)
        {
            word[i] -= 32;
        }
    }
    for(int i=0;1;i++)
    {
        if(word[i]=='\n')
        {
            break;
        }
        else
        {
            printf("%c",word[i]);
        }
    }
}
