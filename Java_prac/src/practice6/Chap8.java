package practice6;

public class Chap8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 11; i <= 20; i++) {
			System.out.println(fibo(i));
		}
	}
	public static int fibo(int n) {
		if(n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
