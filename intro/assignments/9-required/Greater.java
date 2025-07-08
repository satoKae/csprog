/*
２つの実数値（浮動小数点型 double）をキーボードから入力し，大きい方を画面に出力するプログラム
Greater.java を作成せよ．どのようなプロンプト（入力を促す表示），どのように出力するかは自由とする．
*/

import java.util.Scanner;

public class Greater {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("数値1: ");
    double input1 = sc.nextDouble();
    System.out.print("数値2: ");
    double input2 = sc.nextDouble();

    System.out.println(Math.max(input1, input2));

    sc.close();
  }
}