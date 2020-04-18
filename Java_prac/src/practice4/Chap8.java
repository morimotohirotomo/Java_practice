package practice4;
import java.util.Scanner;
public class Chap8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int min = 0;
		for(int i = 0; i < 10; i++) {
			int input = scanner.nextInt();
			if(i == 0) {
				max = input;
				min = input;
			} else {
				if(max < input) {
					max = input;
				}
				if(min > input) {
					min = input;
				}
			}
		}
		System.out.println(max + ":" + min);
	}

}
