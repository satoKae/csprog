import java.util.Scanner;

public class SumAveDouble {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("xの値: ");
    double x = sc.nextDouble();
    System.out.print("yの値: ");
    double y = sc.nextDouble();
    System.out.println("合計: " + (x + y));
    System.out.println("平均: " + (x + y) / 2);
    sc.close();
  }
}
