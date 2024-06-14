import java.util.Scanner;

// W.A.P. to read n numbers in an array and remove the duplicates from an array.

public class codearrduplicate {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n = sc.nextInt();

      int[] arr = new int[n];
      int[] arrd = new int[n];

      System.out.println("Enter the array elements: ");
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }

      // Start traversing elements
      int j = 0;
      for (int i = 0; i < n - 1; i++) {
          // If current element is not equal to next element then store that current element
          if (arr[i] != arr[i + 1]) {
              arrd[j++] = arr[i];
          }
      }

      // Store the last element as whether it is unique or repeated, it hasn't stored previously
      arrd[j++] = arr[n - 1];

      // Modify original array
      for (int i = 0; i < j; i++) {
          arr[i] = arrd[i];
      }

      // Print the unique elements
      System.out.println("Array after removing duplicates:");
      for (int i = 0; i < j; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}



