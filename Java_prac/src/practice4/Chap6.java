package practice4;
import java.util.Scanner;
public class Chap6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		for(int i = 0; i < 10; i++) {
			int input = scanner.nextInt();
			switch(input) {
			case 0:
				lose++;
				break;
			case 1:
				win++;
				break;
			default:
				break;
			}

		}
		System.out.println(win + ":" + lose);
	}

}