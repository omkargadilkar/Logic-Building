
import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j%2==1)
                {
                    System.out.print("*\t");
                }
                else
                {
                     System.out.print("#\t");
                }
            }
            System.out.println();
        }
       
    }
}

public class code1 
{
    public static void main(String[] args)
    {
        Scanner sobj =new Scanner(System.in);

        System.out.println("enter the number of rows:");
        int iValue1=sobj.nextInt();

        System.out.println("enter the number of column:");
        int iValue2=sobj.nextInt();

        Pattern pobj= new Pattern();
        pobj.Display(iValue1, iValue2);


    }
    
}