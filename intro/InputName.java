import java.util.Scanner;

public class InputName {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("姓: ");
    String sei = sc.next();
    System.out.print("名: ");
    String mei = sc.next();
    System.out.println("こんにちは．" + sei + mei + "さん");
    sc.close();
  }
}