package practice5;
import java.util.Scanner;
public class Chap8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] n = new int[10];
		for(int i = 0; i < 10; i++) {
			n[i] = scanner.nextInt();
		}
		for( int i = 0 ; i < 10 ; i++ ){
		    for( int j = i + 1 ; j < 10 ; j++ ){
		        if( n[i] > n[j] ){
		            int t = n[i];
		            n[i] = n[j];
		            n[j] = t;
		        }
		    }
		}
		for(int ns : n) {
			System.out.println(ns);
		}
	}

}
