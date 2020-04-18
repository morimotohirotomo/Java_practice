package practice4;
import java.util.Scanner;
public class Chap16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 2; n > 1; i++) {
			while(n % i == 0) {
				System.out.println(i + " ");
				n /= i;
			}
		}
	}

}
