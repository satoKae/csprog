import java.util.Scanner;

public class Absolute1 {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値：");
    int n = sc.nextInt();
    if (n >= 0) {
      System.out.println("絶対値は" + n + "です");
    } else {
      System.out.println("絶対値は" + (-n) + "です");
    }
    sc.close();
  }
}