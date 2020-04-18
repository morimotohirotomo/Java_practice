package practice4;
import java.util.Scanner;
public class Chap7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for(int i = 1; i < 19; i++) {
			switch(i % 2) {
			case 1:
				int pointA = scanner.nextInt();
				a += pointA;
				System.out.println((i / 2 + 1) + "回表a：" + pointA);
				break;
			case 0:
				int pointB = scanner.nextInt();
				b += pointB;
				System.out.println((i / 2) + "回裏b：" + pointB);
				break;
			}
		}
		System.out.println(a + ":" + b);
	}

}