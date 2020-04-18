package practice4;
import java.util.Scanner;
public class Chap10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		for(int i = 0; i < n; i++) {
//			System.out.println("*");
//		}
//
//		for(int i = 0; i < n; i++) {
//			if(i == 0) {
//				System.out.println(0);
//			} else {
//				System.out.println(i % 10);
//			}
//		}
//
//		int a = 0;
//		while(a <= 100) {
//			int input = scanner.nextInt();
//			a += input;
//		}

		int s = 0;
		int b = 0;
		while(s < 3 && b < 4) {
			int in = scanner.nextInt();
			if(in == 0) {
				s++;
			}
			if (in == 1) {
				b++;
			}
		}
		System.out.println(s + ":" + b);
	}

}
