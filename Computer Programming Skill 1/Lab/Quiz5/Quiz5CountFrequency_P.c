#include<stdio.h>
int a[50000],b[50000],numb[50000];
void main(){//take all input
    int N,i,j,num,cnt=0;
    scanf("%d",&N);
    for(i=0; i<N; i++){//take all
        scanf("%d",&numb[i]);
    }
    for(i=0; i<N; i++){
        for(j=0; j<=i-1; j++){
            if(a[j]==0){//differ when long time
                a[j] = numb[i];
                b[j] = 1;
                cnt++;
                break;
            }
            if(numb[i]==a[j]){
                b[j] += 1;//same
                break;
            }
            else if(j==i-1){
                a[i] = numb[i];//differ
                b[i] = 1;
                cnt++;
                break;
            }
        }
        if(i==0 && cnt==0){
            b[i] = 1;
            a[i] = numb[i];//first num
            cnt=1;
        }
    }
    printf("%d\n",cnt);
    for(i=0; i<cnt; i++){
        printf("%d %d\n",a[i],b[i]);
    }
}

