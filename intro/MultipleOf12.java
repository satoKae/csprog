import java.util.Scanner;

public class MultipleOf12 {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値：");
    int n = sc.nextInt();
    if (n > 0) {
      if (n % 12 == 0) {
        System.out.println("12の倍数です");
      } else {
        System.out.println("12の倍数ではありません");
      }
    } else {
      System.out.println("正ではない値が入力されました");
    }
    sc.close();
  }
}