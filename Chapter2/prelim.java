import java.util.Scanner;
public class prelim {
  public static void main (String [] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter the number:");
  int num = scanner.nextInt();
  feBo(num);
  }
  
  public static void feBo(int num) {
    int a = 0;
    int b = 1;
    for(int i = 0;i < num;i++){
    System.out.printf("\nfibonacci(%d) = %d", i,a);
    int next = a + b;
    a = b;
    b = next;
    }
 }
}
  
  



















