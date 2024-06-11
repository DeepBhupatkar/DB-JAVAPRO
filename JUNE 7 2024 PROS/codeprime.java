
import java.util.Scanner;

 // W.A.P. to check given number is prime or not.
public class codeprime {
    public static void main(String[] args)
    {

        int i=1,count=0 ;      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check weather it is prime or not = ");
        int num = sc.nextInt();

          
       while(i<=num)
       {
            if(num%i==0)
            {
                count++;
            }

            i++;

       }   

       if (count == 2)
       {
        System.out.println("The number is prime");
       }

       else
       {
        System.out.println("The number is not prime");
       }


    }
};