package practice6;

public class Chap7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 10000; i < 10100; i++) {
			if(ss(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean ss(int n) {
		if(n <= 3) {
			return true;
		}
		for(int i = 2; i < n ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
