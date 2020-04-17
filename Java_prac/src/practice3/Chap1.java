package practice3;
import java.util.Scanner;
public class Chap1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

		System.out.println((x > y)? "xはyより大きい" : "xはyより小さい");
	}

}
