package practice4;
import java.util.Scanner;
public class Chap14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int s = 0;
		int b = 0;
		int f = 0;
		while(s < 3 && b < 4) {
			int n = scanner.nextInt();
			if(n == 0) {
				s++;
			} else if(n == 1) {
				b++;
			} else if(n == 2 && s < 2) {
				s++;
			}
		}
	}

}
