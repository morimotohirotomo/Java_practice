package practice4;
import java.util.Scanner;
public class Chap18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for(;;) {
			int n = scanner.nextInt();
			if(n == 0) {
				break;
			}
			sum += n;
			count++;
		}
		System.out.println(sum);
		System.out.println(sum / count);
	}

}
