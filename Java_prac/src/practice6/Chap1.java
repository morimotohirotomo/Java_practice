package practice6;

public class Chap1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(pow(3));
		System.out.println(avg(3, 7));
		System.out.println(max(9, 5));
	}
	public static int pow(int n) {
		return n * n;
	}

	public static int avg(int a, int b) {
		return (a + b) / 2;
	}

	public static int max(int a, int b) {
		return ((a > b)? a : b);
	}
}
