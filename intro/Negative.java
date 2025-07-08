import java.util.Scanner;

public class Negative {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値: ");
    int n = sc.nextInt();
    if (n < 0) {
      System.out.println("その値は負です");
    }
    sc.close();
  }
}