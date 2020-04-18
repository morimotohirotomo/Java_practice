package practice3;
import java.util.Scanner;
public class Chap12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("1：まぐろ　2：えび　3：こはだ　4：たい");
		int n = scanner.nextInt();
		switch(n) {
		case 1:
			System.out.println("good");
			break;
		case 2:
			System.out.println("nice");
			break;
		case 3:
			System.out.println("bad");
			break;
		case 4:
			System.out.println("great");
			break;
		default:
			System.out.println("1~4");
			break;
		}
	}

}
