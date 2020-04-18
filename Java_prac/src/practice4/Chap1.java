package practice4;

public class Chap1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = 0;
		while(n < 10) {
			System.out.println("SPAM");
			n++;
		}

		for(int a = 1; a < 10; a++) {
			System.out.println(a * 3);
		}

		int bb = 1;
		for(int b = 1; b < 9; b++) {
			bb *= 2;
			System.out.println(bb);
		}

		int c = 1;
		for( int cc = 2 ; cc <= 7 ; cc++ ) {
		    c *= cc;
		}
		System.out.println( c );
	}

}
