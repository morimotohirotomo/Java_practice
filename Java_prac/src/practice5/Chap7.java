package practice5;
import java.util.Scanner;
public class Chap7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int kuku[][] = new int[9][9];

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
			kuku[i]
			[j] = (i + 1) * (j + 1);
			}
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(kuku[a - 1][b - 1]);
	}

}
