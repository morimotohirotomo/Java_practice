package practice4;
import java.util.Scanner;
public class Chap15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		int n = scanner.nextInt();
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				bool = false;
				break;
			}
		}
		if(bool) {
			System.out.println("素数");
		} else {
			System.out.println("素数でない");
		}
	}

}
