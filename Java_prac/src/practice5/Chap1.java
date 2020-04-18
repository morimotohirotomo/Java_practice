package practice5;
import java.util.Scanner;
public class Chap1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		for(int n = 0; n < 10; n++) {
			a[n] = scanner.nextInt();
		}
//		for(int b: a) {
//			System.out.println(b * 2);
//		}
//
//		for(int n = 0; n < 10; n++) {
//			System.out.println(a[9 - n]);
//		}

		for(int c: a) {
			if(c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		for(int c: a) {
			if(c % 2 == 1) {
				System.out.print(c + " ");
			}
		}
	}

}
