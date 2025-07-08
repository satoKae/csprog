import java.util.Scanner;

public class TriangleArea {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("底辺: ");
    double width = sc.nextDouble();
    System.out.print("高さ: ");
    double height = sc.nextDouble();
    System.out.println("三角形の面積: " + (width * height / 2));
    sc.close();
  }
}
