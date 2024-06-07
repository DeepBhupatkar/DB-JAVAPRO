 
public class codedivbysnt {
    public static void main(String[] args)
    {

        // int i=1,count=0 ;      
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number you want to check weather it is prime or not = ");
        // int num = sc.nextInt();



      

        for (int i = 150; i<=445 ; i++)
        {

            if (i%2==1 && i%7==0 && i%3!=0)
            {
                System.out.println(i);
            }
        }


    }

}