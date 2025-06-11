import java.util.Scanner;
class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        char ch=0;
        
        for(i=1;i<=iRow;i++)
        {
            if(i%2==0)
            
                ch ='a';
            
            else
            
                ch='A';
            
            for(j=1;j<=iCol;j++,ch++)
            {
                System.out.print(ch + "\t");
            }
            System.out.println();
        }

        }
      
    }

public class code9
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
