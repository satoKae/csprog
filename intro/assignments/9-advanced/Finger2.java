/*
０をグー，１をチョキ，２をパーとする．コンピュータの手をランダムに生成し，
ユーザの手をキーボードから入力（０か１か２を入力）し，お互いのじゃんけんの手と，どちらが勝った
かを表示するプログラムを作れ
*/

import java.util.Scanner;
import java.util.Random;

public class Finger2 {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] hands = { "グー", "チョキ", "パー" };

    System.out.print("何を出しますか(0:グー 1:チョキ 2:パー)?: ");
    int playerHand = sc.nextInt();
    int computerHand = new Random().nextInt(3);

    try {
      System.out.println("あなたの手: " + hands[playerHand]);
      System.out.println("コンピューターの手: " + hands[computerHand]);
      switch ((computerHand - playerHand + 3) % 3) {
        case 0:
          System.out.println("引き分け");
          break;

        case 1:
          System.out.println("あなたの勝ち");
          break;

        case 2:
          System.out.println("コンピューターの勝ち");
          break;
      }

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("0から2までの整数を入力してください");

    } finally {
      sc.close();
    }
  }
}