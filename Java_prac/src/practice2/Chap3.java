package practice2;
import java.util.Scanner;
public class Chap3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(Math.pow(x, 2));
		System.out.println(Math.pow(x, 3));
		System.out.println(Math.pow(x, 4));

		int n = x;
		for (int i = 0; i < 3; i++) {
			System.out.println(x *= n);
		}
	}

}
