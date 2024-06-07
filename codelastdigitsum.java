
import java.util.Scanner;


 
public class codelastdigitsum{
    public static void main(String[] args)
    {

    
          
             int r,sum=0,temp;   
             Scanner sc = new Scanner(System.in); 
             System.out.println("Enter First number = ");
             int num1 = sc.nextInt();

             System.out.println("Enter Second number = ");
             int num2 = sc.nextInt();
             
               
             int first= num1%10;
             int second= num2%10;
              sum = first + second;

              System.out.println("The sum is = "+ sum);    
            
           }  
        
}  


 