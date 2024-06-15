import java.util.Scanner;

 // W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers.
public class codearrevenoddsum {
    public static void main(String[] args)
    {

        int i=0, oddsum=0, evensum=0;      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();



       int arr[] = new int[n];
 
       for (i=0; i<n; i++)
       {
          System.out.println("Enter the array elements = ");
           arr[i] = sc.nextInt();

       }


       for (i=0; i<n; i++)
       {
        //   System.out.println("Array elements are = "+ arr[i]);
         
            if (i%2==0)
            {
                oddsum = oddsum +arr[i];
            }
            else
            {
                evensum = evensum +arr[i];
            }
           

       }
    
       System.out.println("ODD NUMBER SUM FROM ARRAY IS = "+ oddsum);
       System.out.println("EVEN NUMBER SUM FROM ARRAY IS = "+ evensum);
       


    }
}



