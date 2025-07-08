import java.util.Scanner;

public class ScanInteger {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値: ");
    int x = sc.nextInt();
    System.out.println(x + " と入力しました");
    sc.close();
  }
}
