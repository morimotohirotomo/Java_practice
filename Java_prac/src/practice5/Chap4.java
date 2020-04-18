package practice5;
import java.util.Scanner;
public class Chap4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] n = new int[10];
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			n[i] = scanner.nextInt();
			sum += n[i];
			if(sum > 100) {
				break;
			}
		}
		for(int nums : n) {
			System.out.println(nums);
		}

	}

}
