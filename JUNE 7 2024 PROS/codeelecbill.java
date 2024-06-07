    
import java.util.Scanner;

 
public class codeelecbill {
    public static void main(String[] args)
    {

        float i=1,count=0,secondunit,thirdunit,pr ;      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit you used =  ");
        int unit = sc.nextInt();
        
        
        if(unit>100)
        {
            // System.out.println("The bill amount is = "+unit*80);
            
            float firstunit = (float) (unit*0.80) + 4;
            secondunit = (float) (firstunit + 100*0.90);
        
             pr =  (float) ((12.8 * 100) / 100);

           thirdunit =  (float) (secondunit +pr);

           if(unit>=201 && unit<300)
            { 
                System.out.println("The bill amount is = "+secondunit);
            }

            else if(unit>=300)
            { 
                System.out.println("The bill amount is = "+thirdunit);
            }

            else{
                System.out.println("The bill amount is = "+firstunit);
            }


        }
        else
        {
            System.out.println("The bill amount is = 100 ");
        }



    }
}