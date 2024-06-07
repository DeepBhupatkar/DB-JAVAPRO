
import java.util.Scanner;


 
public class codepalindrome {
    public static void main(String[] args)
    {

    
          
             int r,sum=0,temp;   
             Scanner sc = new Scanner(System.in); 
             System.out.println("Enter the number you want to check weather it is palindrome or not = ");
             
             int n = sc.nextInt();
             
             temp=n;    
             while(n>0){    
              r=n%10;  
              sum=(sum*10)+r;    
              n=n/10;    
             }    
             if(temp==sum)    
              System.out.println("the given number is palindrome number ");    
             else    
              System.out.println("the given number is not palindrome number");    
           }  
        
}  


 