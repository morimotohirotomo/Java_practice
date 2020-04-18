package practice5;
import java.util.Scanner;
public class Chap5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int binary[] = new int[16];
		int n = scanner.nextInt();

		for( int i = 15 ; i >= 0 ; i--, n /= 2 ) {
		    binary[i] = n % 2;
		}
		for( int i = 0 ; i < 16 ; i++ ) {
		    System.out.print( binary[i] );
		}
	}

}
