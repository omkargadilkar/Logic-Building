//input 8
// output : 2 4 6 8 10 12 14 16

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt=0;
    int iNum=2;
    
    for (iCnt=1;iCnt<=8;iCnt++)

    {
      printf("%d\t",iNum);
      iNum=iNum+2;
    }
    
}

int main()
{
   int iValue=0;
 
    printf("enter the Elements:");

    scanf("%d",&iValue);

    Pattern (iValue);


    return 0;
}