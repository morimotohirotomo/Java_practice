package practice4;

public class Chap22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		while( n1 <= 100){
		    System.out.print( n1 + "," );
		    n1 = n2;
		    n2 = n3;
		    n3 = n1 + n2;
		}

		for(int i = 0; i < 10; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int num) {
		if (num < 2) {
			return num;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}

}
