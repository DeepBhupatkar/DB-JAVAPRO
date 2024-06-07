import java.util.Scanner;


 
public class codeposint{
    public static void main(String[] args)
    {

    
          
         
             Scanner sc = new Scanner(System.in); 
             System.out.println("Enter the positive integer number to check weather it is Even or Odd= ");
             int num1 = sc.nextInt();
         
             if (num1 >= 1)
{
             String result = (num1&1)==0?"EVEN":"ODD";
             System.out.println(result);
    }



    else {

        System.out.println("Enter a positive number");
    }
    }
}