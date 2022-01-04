#include<stdio.h>
void calls(int **t)
{
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<5;j++)
        {
            *((*(t+i))+j)=0;
        }
    }
}
int main()
{
    int a[5]={1,2,3,4,5};
    int b[5]={6,7,8,9,10};
    int * t[2]={a,b};
    calls(t);
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<5;j++)
        {
            printf("%d\t",*((*(t+i))+j));
        }
    }
}