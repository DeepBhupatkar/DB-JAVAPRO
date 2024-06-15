    
import java.util.Scanner;

 //Accept three integer values from the user and display them in ascending order using only operators (i.e. without using if…else, switch case, or loop).
public class codeascending {
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

          
    //    int largest = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);


    //    int bignum1 = ((num1>num2)?((num1>num3)?num1:num2)


       int bignum1 = (num1<= num2 && num1 <= num3) ? num1 :(num2 <= num1 && num2 <= num3) ? num2 : num3 ;
       int bignum2 = (num2<= num1 && num2 <= num3) ? num2 :(num1 <= num2 && num1 <= num3) ? num1 : num2 ;
       int bignum3 = (num3<= num1 && num3 <= num2) ? num3 :(num3 <= num1 && num2 <= num2) ? num2 : num3 ;



    //    int bignum2 = (num2>num1)?((num2>num3)?num2);
    //    int bignum3 = (num3>num1)?((num3>num2)?num3);
      
      //for ascending order 

        System.out.println("The Ascending Order Of Given three number = "+bignum1+","+bignum2+","+bignum3+".");
        // System.out.println(bignum2);
        // System.out.println(bignum3);

    


    }
}