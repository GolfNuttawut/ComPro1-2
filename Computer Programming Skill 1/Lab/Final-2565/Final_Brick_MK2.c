#include <stdio.h>
void main()
{
    int N,M;
    scanf("%d%d",&N,&M);//�Ѻ��� N = ��� ,M = �������
    char table[N][M];   //��й������¹��ҧ�͡ main �ҡ�Դ Error
    int Brick[M];       //��й������¹��ҧ�͡ main �ҡ�Դ Error
    //�Ѻ���㹵��ҧ
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            scanf("%c",&table[row][col]);// ! �ҡ��ǵ�Ǩ�ӵͺ�� Linux ���� \n �͡ ���лѭ�ҡ�â�鹺�÷Ѵ����о����� Windows
        }
    }
    //�Ѻ��Ҩӹǹ Brick �����Ф������
    for(int i=0;i<M;i++)
    {
        scanf("%d",&Brick[i]);
    }
    for(int i=0;i<M;i++)//ǹ�ٻ M �ͺ (����ӹǹ�������)
    {
        for(int j=0;j<Brick[i];j++)// ǹ�ٻ����ӹǹ Brick �������ͺ
        {
            for(int row=0;row<N;row++)//ǹ�ٻ����ӹǹ���
            {
                if(table[row][i]!='.')//��Ǩ�ͺ���͹� �ҡ����� '.' (�ش) �������¹������ǡ�͹˹���� # ����Ǩ��ٻ
                {
                    table[row-1][i]='#';
                    break;
                }
                //�ҡ���ٻ���͹䢢�ҧ��ҧ�����١��
                if(row==N-1)//����Ͷ֧����ش���¨�����¹��������ش���¢ͧ������� i �� # ( -1 ����������Ѻ�ҡ 0)
                {
                    table[N-1][i]='#';
                }
            }
        }
    }
    //�ٻ��ʴ���
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            printf("%c",table[row][col]);
        }
        printf("\n");
    }
}
