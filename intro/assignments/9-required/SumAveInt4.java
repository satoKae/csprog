/*
4つの整数値（整数型 int）をキーボードから入力し，合計と平均を求めるプログラム SumAveInt4.java
を作成せよ（講義資料等を参考にせよ）
*/

import java.util.Scanner;

public class SumAveInt4 {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double totalNumbers = 0;

    for (int i = 0; i < 4; i++) {
      System.out.print("数値" + (i + 1) + ": ");
      totalNumbers += sc.nextInt();
    }

    System.out.println("\n合計: " + (int)totalNumbers);
    System.out.println("平均: " + totalNumbers / 4);
    sc.close();
  }
}