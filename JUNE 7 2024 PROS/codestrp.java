
import java.util.Scanner;

 
public class codestrp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string you want to print: ");
    String str = sc.nextLine();

    for (int i = 1; i <= str.length(); i++) {
        System.out.println(str.substring(0, i));
    }
}
}