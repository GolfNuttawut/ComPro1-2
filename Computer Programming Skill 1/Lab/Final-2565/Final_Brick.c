#include <stdio.h>
void main()
{
    int N,M;
    scanf("%d%d",&N,&M);//รับค่า N = เเถว ,M = คอลัมน์
    char table[N][M];   //เเนะนำให้เขียนข้างนอก main หากเกิด Error
    int Brick[M];       //เเนะนำให้เขียนข้างนอก main หากเกิด Error
    //รับค่าในตาราง
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            scanf("\n%c",&table[row][col]);// ! หากตัวตรวจคำตอบเป็น Linux ให้นำ \n ออก เพราะปัญหาการขึ้นบรรทัดใหม่จะพบเเค่ใน Windows
        }
    }
    //รับค่าจำนวน Brick ในเเต่ละคอลัมน์
    for(int i=0;i<M;i++)
    {
        scanf("%d",&Brick[i]);
    }
    for(int i=0;i<M;i++)//วนลูป M รอบ (ตามจำนวนคอลัมน์)
    {
        for(int j=0;j<Brick[i];j++)// วนลูปตามจำนวน Brick ในเเต่ละรอบ
        {
            for(int row=0;row<N;row++)//วนลูปตามจำนวนเเถว
            {
                if(table[row][i]!='.')//ตรวจสอบเงื่อนไข หากไม่ใช่ '.' (จุด) ให้เปลี่ยนค่าในเเถวก่อนหน้าเป็น # เเล้วจบลูป
                {
                    table[row-1][i]='#';
                    break;
                }
                //หากจบลูปเงื่อนไขข้างล่างจะไม่ถูกเช็ค
                if(row==N-1)//เมื่อถึงเเถวสุดท้ายจะเปลี่ยนค่าในเเถวสุดท้ายของคอลัมน์ i เป็น # ( -1 เพราะเริ่มนับจาก 0)
                {
                    table[N-1][i]='#';
                }
            }
        }
    }
    //ลูปเเสดงผล
    for(int row=0;row<N;row++)
    {
        for(int col=0;col<M;col++)
        {
            printf("%c",table[row][col]);
        }
        printf("\n");
    }
}
