import java.util.Scanner;

public class DaysOfMonth {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("月：");
    int m = sc.nextInt();
    int ds = 0;
    switch (m) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        ds = 31;
        break;

      case 4:
      case 6:
      case 9:
      case 11:
        ds = 30;
        break;

      case 2:
        ds = 28;
        break;
    }
    if (ds != 0) {
      System.out.println(m + "月は" + ds + "日まで");
    }
    sc.close();
  }
}