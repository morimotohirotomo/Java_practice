package practice4;
import java.util.Scanner;
public class Chap5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			int input = scanner.nextInt();
			sum += input;
		}
		System.out.println(sum / 10);
	}

}
