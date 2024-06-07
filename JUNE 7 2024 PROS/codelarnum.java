    
import java.util.Scanner;

 
public class codelarnum {
    public static void main(String[] args)
    {

        int i=1,count=0 ;      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number =  ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number =  ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number =  ");
        int num3 = sc.nextInt();

          
       int largest = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);

      
        System.out.println("the largest number among given three is = "+largest);
       

    


    }
}