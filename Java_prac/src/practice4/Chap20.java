package practice4;
import java.util.Scanner;
public class Chap20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int a = 1; a <= i; a++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}

}
