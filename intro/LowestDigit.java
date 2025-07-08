import java.util.Scanner;

public class LowestDigit {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値: ");
    int x = sc.nextInt();
    System.out.println("最下位桁以外は" + (x / 10));
    System.out.println("最下位桁は" + (x % 10));
    sc.close();
  }
}
