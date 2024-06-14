
import java.util.Scanner;

 //Create a program that would accept a string from the user and print a pattern. For example, ifthe user enters “Hello”, it should print a pattern as follows:H He Hel Hell Hello
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