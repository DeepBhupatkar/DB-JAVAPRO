import java.util.Scanner;


 
public class codebitwise{
    public static void main(String[] args)
    {

    
          
         
             Scanner sc = new Scanner(System.in); 
             System.out.println("Enter First number = ");
             int num1 = sc.nextInt();


             String result = (num1&1)==0?"EVEN":"ODD";
             System.out.println(result);


    }
}